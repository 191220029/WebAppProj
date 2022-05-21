package com.springboot.sprintboottest.controller;

import com.springboot.sprintboottest.Entity.*;
import jxl.Workbook;
import jxl.format.Alignment;
import jxl.format.Border;
import jxl.format.BorderLineStyle;
import jxl.format.Colour;
import jxl.write.*;
import jxl.write.Label;
import org.springframework.beans.factory.annotation.Autowired;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.util.List;

public class XLSWriter {
    @Autowired
    public static String cardToXLS(role r, user u, roleBaseInfo rbi, roleElement re, String dir)
            throws IOException, WriteException{

        File xlsFile = new File(dir);
        if(!xlsFile.exists())
            xlsFile.mkdir();
        xlsFile = new File(dir + r.getRoleCardId().toString() + ".xls");
        WritableWorkbook workbook = Workbook.createWorkbook(xlsFile);
        WritableSheet sheet = workbook.createSheet("角色卡", 0);

        //List<Label> labels = new ArrayList<>();
        WritableCellFormat headerFormat = new WritableCellFormat();
        Color color = Color.decode("#3366ff");
        workbook.setColourRGB(Colour.DARK_BLUE, color.getRed(), color.getGreen(), color.getBlue());
        color = Color.decode("#cae1ff");
        workbook.setColourRGB(Colour.LIGHT_BLUE, color.getRed(), color.getGreen(),color.getRed());
        color = Color.decode("#ebebeb");
        workbook.setColourRGB(Colour.GREY_25_PERCENT, color.getRed(), color.getGreen(),color.getRed());
        headerFormat.setBackground(Colour.DARK_BLUE);
        headerFormat.setAlignment(Alignment.CENTRE);
        headerFormat.setBorder(Border.ALL, BorderLineStyle.NONE);
        WritableFont headerFont = new WritableFont(WritableFont.TIMES, 10);
        headerFont.setColour(Colour.WHITE);
        headerFormat.setFont(headerFont);
        headerFormat.setBorder(Border.NONE, BorderLineStyle.NONE);
        WritableCellFormat columnFormatA = new WritableCellFormat(headerFormat);
        columnFormatA.setAlignment(Alignment.LEFT);
        WritableFont cellFont = new WritableFont(headerFont);
        cellFont.setColour(Colour.BLACK);
        columnFormatA.setFont(cellFont);
        columnFormatA.setBackground(Colour.LIGHT_BLUE);
        WritableCellFormat columnFormatB = new WritableCellFormat(columnFormatA);
        columnFormatB.setBackground(Colour.GREY_25_PERCENT);

        roleBaseInfoXLS(sheet, rbi, headerFormat, columnFormatA, columnFormatB, 0, 0);
        roleElementXLS(sheet, re, headerFormat, columnFormatA, columnFormatB, 5, 0);
        roleStatusXLS(sheet, re, headerFormat, columnFormatA, columnFormatB, 0, 7);
        roleSkillXLS(sheet, r, headerFormat, columnFormatA, columnFormatB, 0, 12);
        workbook.write();
        workbook.close();
        return xlsFile.getPath().substring(xlsFile.getPath().indexOf("\\serverfs"));
    }

    // 调查员信息
    private static void roleBaseInfoXLS(WritableSheet sheet, roleBaseInfo rbi,
                              WritableCellFormat headerFormat, WritableCellFormat columnFormatA, WritableCellFormat columnFormatB,
                                        Integer x, Integer y)
            throws WriteException{

        Label label = new Label(x + 0, y + 0, "调查员信息", headerFormat);
        sheet.addCell(label);
        sheet.mergeCells(x + 0, y + 0, x + 3, y + 0);
        label = new Label(x + 0, y + 1, "姓名", columnFormatB);
        sheet.addCell(label);
        label = new Label(x + 1, y + 1, rbi.getRoleName(), columnFormatB);
        sheet.addCell(label);
        label = new Label(x + 2, y + 1, "", columnFormatB);
        sheet.addCell(label);
        label = new Label(x + 3, y + 1, "", columnFormatB);
        sheet.addCell(label);
        label = new Label(x + 0, y + 2, "玩家", columnFormatA);
        sheet.addCell(label);
        label = new Label(x + 1, y + 2, rbi.getUserName(), columnFormatA);
        sheet.addCell(label);
        label = new Label(x + 2, y + 2, "年代", columnFormatA);
        sheet.addCell(label);
        label = new Label(x + 3, y + 2, rbi.getEra(), columnFormatA);
        sheet.addCell(label);
        label = new Label(x + 0, y + 3, "职业", columnFormatB);
        sheet.addCell(label);
        label = new Label(x + 1, y + 3, rbi.getRoleJobName(), columnFormatB);
        sheet.addCell(label);
        label = new Label(x + 2, y + 3, "职业序号", columnFormatB);
        sheet.addCell(label);
        label = new Label(x + 3, y + 3, rbi.getRoleJobId().toString(), columnFormatB);
        sheet.addCell(label);
        label = new Label(x + 0, y + 4, "年龄", columnFormatA);
        sheet.addCell(label);
        label = new Label(x + 1, y + 4, rbi.getRoleAge().toString(), columnFormatA);
        sheet.addCell(label);
        label = new Label(x + 2, y + 4, "性别", columnFormatA);
        sheet.addCell(label);
        label = new Label(x + 2, y + 5, rbi.getRoleGenderString(), columnFormatA);
        sheet.addCell(label);
        label = new Label(x + 0, y + 5, "住地", columnFormatB);
        sheet.addCell(label);
        label = new Label(x + 1, y + 5, rbi.getRoleHomeAddress(), columnFormatB);
        sheet.addCell(label);
        label = new Label(x + 2, y + 5, "故乡", columnFormatB);
        sheet.addCell(label);
        label = new Label(x + 3, y + 5, rbi.getRoleHometown(), columnFormatB);
        sheet.addCell(label);
    }
    // 调查员属性
    private static void roleElementXLS(WritableSheet sheet, roleElement re,
                                     WritableCellFormat headerFormat, WritableCellFormat columnFormatA, WritableCellFormat columnFormatB,
                                       Integer x, Integer y)
            throws WriteException {

        Label label = new Label(x + 0, y + 0, "属性", headerFormat);
        sheet.addCell(label);
        sheet.mergeCells(x + 0, y + 0, x + 7, y + 0);
        label = new Label(x + 0, y + 1, "力量STR", columnFormatB);
        sheet.addCell(label);
        label = new Label(x + 1, y + 1, re.getRolestr().toString(), columnFormatB);
        sheet.addCell(label);
        label = new Label(x + 2, y + 1, Integer.toString(re.getRolestr() / 2), columnFormatB);
        sheet.addCell(label);
        label = new Label(x + 3, y + 1, Integer.toString(re.getRolestr() / 4), columnFormatB);
        sheet.addCell(label);
        label = new Label(x + 4, y + 1, "敏捷DEX", columnFormatA);
        sheet.addCell(label);
        label = new Label(x + 5, y + 1, re.getRoledex().toString(), columnFormatA);
        sheet.addCell(label);
        label = new Label(x + 6, y + 1, Integer.toString(re.getRoledex() / 2), columnFormatA);
        sheet.addCell(label);
        label = new Label(x + 7, y + 1, Integer.toString(re.getRoledex() / 4), columnFormatA);
        sheet.addCell(label);

        label = new Label(x + 0, y + 2, "体质CON", columnFormatA);
        sheet.addCell(label);
        label = new Label(x + 1, y + 2, re.getRolecon().toString(), columnFormatA);
        sheet.addCell(label);
        label = new Label(x + 2, y + 2, Integer.toString(re.getRolecon() / 2), columnFormatA);
        sheet.addCell(label);
        label = new Label(x + 3, y + 2, Integer.toString(re.getRolecon() / 4), columnFormatA);
        sheet.addCell(label);
        label = new Label(x + 4, y + 2, "外貌APP", columnFormatB);
        sheet.addCell(label);
        label = new Label(x + 5, y + 2, re.getRoledex().toString(), columnFormatB);
        sheet.addCell(label);
        label = new Label(x + 6, y + 2, Integer.toString(re.getRoleapp() / 2), columnFormatB);
        sheet.addCell(label);
        label = new Label(x + 7, y + 2, Integer.toString(re.getRoleapp() / 4), columnFormatB);
        sheet.addCell(label);


        label = new Label(x + 0, y + 3, "体型SIZ", columnFormatB);
        sheet.addCell(label);
        label = new Label(x + 1, y + 3, re.getRolesiz().toString(), columnFormatB);
        sheet.addCell(label);
        label = new Label(x + 2, y + 3, Integer.toString(re.getRolesiz() / 2), columnFormatB);
        sheet.addCell(label);
        label = new Label(x + 3, y + 3, Integer.toString(re.getRolesiz() / 4), columnFormatB);
        sheet.addCell(label);
        label = new Label(x + 4, y + 3, "智力INT", columnFormatA);
        sheet.addCell(label);
        label = new Label(x + 5, y + 3, re.getRoleint().toString(), columnFormatA);
        sheet.addCell(label);
        label = new Label(x + 6, y + 3, Integer.toString(re.getRoleint() / 2), columnFormatA);
        sheet.addCell(label);
        label = new Label(x + 7, y + 3, Integer.toString(re.getRoleint() / 4), columnFormatA);
        sheet.addCell(label);

        label = new Label(x + 0, y + 4, "意志POW", columnFormatA);
        sheet.addCell(label);
        label = new Label(x + 1, y + 4, re.getROlepow().toString(), columnFormatA);
        sheet.addCell(label);
        label = new Label(x + 2, y + 4, Integer.toString(re.getROlepow() / 2), columnFormatA);
        sheet.addCell(label);
        label = new Label(x + 3, y + 4, Integer.toString(re.getROlepow() / 4), columnFormatA);
        sheet.addCell(label);
        label = new Label(x + 4, y + 4, "教育APP", columnFormatB);
        sheet.addCell(label);
        label = new Label(x + 5, y + 4, re.getROleedu().toString(), columnFormatB);
        sheet.addCell(label);
        label = new Label(x + 6, y + 4, Integer.toString(re.getROleedu() / 2), columnFormatB);
        sheet.addCell(label);
        label = new Label(x + 7, y + 4, Integer.toString(re.getROleedu() / 4), columnFormatB);
        sheet.addCell(label);


        label = new Label(x + 0, y + 5, "移动力MOV", columnFormatB);
        sheet.addCell(label);
        label = new Label(x + 1, y + 5, re.getRolemov().toString(), columnFormatB);
        sheet.addCell(label);
        label = new Label(x + 2, y + 5, Integer.toString(re.getRolemov() / 2), columnFormatB);
        sheet.addCell(label);
        label = new Label(x + 3, y + 5, Integer.toString(re.getRolemov() / 4), columnFormatB);
        sheet.addCell(label);
        label = new Label(x + 4, y + 5, "幸运Luck", columnFormatA);
        sheet.addCell(label);
        label = new Label(x + 5, y + 5, re.getRole_luck().toString(), columnFormatA);
        sheet.addCell(label);
        label = new Label(x + 6, y + 5, Integer.toString(re.getRole_luck() / 2), columnFormatA);
        sheet.addCell(label);
        label = new Label(x + 7, y + 5, Integer.toString(re.getRole_luck() / 4), columnFormatA);
        sheet.addCell(label);
    }

    private static void roleStatusXLS(WritableSheet sheet, roleElement re,
                                       WritableCellFormat headerFormat, WritableCellFormat columnFormatA, WritableCellFormat columnFormatB,
                                       Integer x, Integer y)
            throws WriteException {

        Label label = new Label(x + 0, y + 0, "调查员状态", headerFormat);
        sheet.addCell(label);
        sheet.mergeCells(x + 0, y + 0, x + 3, y + 0);
        label = new Label(x + 0, y + 1, "体力", columnFormatB);
        sheet.addCell(label);
        label = new Label(x + 1, y + 1, re.getRole_cur_hit_points().toString() + "/" + re.getRole_max_hit_points(), columnFormatB);
        sheet.addCell(label);
        label = new Label(x + 2, y + 1, "理智", columnFormatA);
        sheet.addCell(label);
        label = new Label(x + 3, y + 1, re.getRole_cur_sanity() + "/" + re.getRole_max_sanity().toString(), columnFormatA);
        sheet.addCell(label);

        label = new Label(x + 0, y + 2, "魔法", columnFormatA);
        sheet.addCell(label);
        label = new Label(x + 1, y + 2, re.getRole_cur_magic().toString() + "/" + re.getRole_max_magic(), columnFormatA);
        sheet.addCell(label);
        label = new Label(x + 2, y + 2, "身体状态", columnFormatB);
        sheet.addCell(label);
        label = new Label(x + 3, y + 2, re.getRole_physical_status(), columnFormatB);
        sheet.addCell(label);


        label = new Label(x + 0, y + 3, "精神状态", columnFormatB);
        sheet.addCell(label);
        label = new Label(x + 1, y + 3, re.getRole_mental_status(), columnFormatB);
        sheet.addCell(label);
        label = new Label(x + 2, y + 3, "", columnFormatB);
        sheet.addCell(label);
        label = new Label(x + 3, y + 3, "", columnFormatB);
        sheet.addCell(label);
    }

    private static void roleSkillXLS(WritableSheet sheet, role r,
                                   WritableCellFormat headerFormat, WritableCellFormat columnFormatA, WritableCellFormat columnFormatB,
                                   Integer x, Integer y)
            throws WriteException {

        Label label = new Label(x + 0, y + 0, "技能表", headerFormat);
        sheet.addCell(label);
        sheet.mergeCells(x + 0, y + 0, x + 9, y + 0);
        WritableCellFormat cellHeader = new WritableCellFormat(columnFormatA);
        cellHeader.setAlignment(Alignment.CENTRE);
        label = new Label(x + 0, y + 1, "本职", cellHeader);
        sheet.addCell(label);
        label = new Label(x + 1, y + 1, "技能名称", cellHeader);
        sheet.addCell(label);
        label = new Label(x + 3, y + 1, "初始", cellHeader);
        sheet.addCell(label);
        label = new Label(x + 4, y + 1, "成长", cellHeader);
        sheet.addCell(label);
        label = new Label(x + 5, y + 1, "职业", cellHeader);
        sheet.addCell(label);
        label = new Label(x + 6, y + 1, "兴趣", cellHeader);
        sheet.addCell(label);
        label = new Label(x + 7, y + 1, "成功率", cellHeader);
        sheet.addCell(label);
        sheet.mergeCells(x + 1, y + 1, x + 2, y + 1);
        sheet.mergeCells(x + 7, y + 1, x + 9, y + 1);

        List<SkillUnit> skillUnits = r.getSkillUnits();
        Integer lineNum = 2;
        for(SkillUnit skillUnit : skillUnits){
            WritableCellFormat format = new WritableCellFormat((lineNum % 2 == 0)?columnFormatA:columnFormatB);
            format.setAlignment(Alignment.CENTRE);
            label = new Label(x + 0, y + lineNum, "", format);
            sheet.addCell(label);
            label = new Label(x + 1, y + lineNum, skillUnit.name, format);
            sheet.addCell(label);
            if(skillUnit.nameVal.equals(""))
                sheet.mergeCells(x + 1, y + lineNum, x + 2, y + lineNum);
            else{
                label = new Label(x + 2, y + lineNum, skillUnit.nameVal, format);
                sheet.addCell(label);
            }
            label = new Label(x + 3, y + lineNum, skillUnit.initVal.toString(), format);
            sheet.addCell(label);
            label = new Label(x + 4, y + lineNum, skillUnit.growthVal.toString(), format);
            sheet.addCell(label);
            label = new Label(x + 5, y + lineNum, skillUnit.jobVal.toString(), format);
            sheet.addCell(label);
            label = new Label(x + 6, y + lineNum, skillUnit.interestVal.toString(), format);
            sheet.addCell(label);
            label = new Label(x + 7, y + lineNum, skillUnit.sum().toString(), format);
            sheet.addCell(label);
            label = new Label(x + 8, y + lineNum, Integer.toString(skillUnit.sum() / 2), format);
            sheet.addCell(label);;
            label = new Label(x + 9, y + lineNum, Integer.toString(skillUnit.sum() / 4), format);
            sheet.addCell(label);
            lineNum++;
        }
    }
}
