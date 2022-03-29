package com.springboot.sprintboottest.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

@RestController
public class UploadController {
    @RequestMapping("/user/uploadIcon")
    public String uploadUserIcon(HttpServletRequest request,
                                 @RequestParam("icon")MultipartFile icon)
            throws IOException {
        if(icon == null || icon.getSize() <= 0)
            return "FALSE";
        //System.out.println(f.getPath());
        //inputStreamToFile(inputStream, f);
        String dir = "E:\\本科\\SpringBoot\\sprintboot-test\\serverfs\\img\\usricon\\";
        Object object = request.getSession().getAttribute("UserId");
        Integer userId = Integer.parseInt(object.toString());
        //System.out.println(userId);
        InputStream inputStream = icon.getInputStream();
        File f = new File(pathGenerate(userId, dir, icon.getOriginalFilename()));
        OutputStream outputStream = new FileOutputStream(f);
        //System.out.println(f.getPath());
        byte[] buffer = new byte[8192];
        Integer bytesRead = 0;
        while ((bytesRead = inputStream.read(buffer, 0, 8192)) != -1) {
            outputStream.write(buffer, 0, bytesRead);
        }
        outputStream.close();
        return "TRUE";
    }
    private Boolean saveFile(InputStream inputStream){
        return true;
    }
    private String pathGenerate(Integer userId,String directory, String originPath){
        Date date = new Date();
        SimpleDateFormat ft = new SimpleDateFormat ("yyyy-MM-dd-hh-mm-ss");
        //String suffix = new String(originPath.substring(originPath.lastIndexOf('.')));
        String curPath = directory + userId.toString()+"_"+ft.format(date)+originPath;
        return curPath;
    }
    private static void inputStreamToFile(InputStream ins, File file) {
        try {
            OutputStream os = new FileOutputStream(file);
            int bytesRead = 0;
            byte[] buffer = new byte[8192];
            while ((bytesRead = ins.read(buffer, 0, 8192)) != -1) {
                os.write(buffer, 0, bytesRead);
            }
            os.close();
            ins.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
