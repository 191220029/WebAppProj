package com.springboot.sprintboottest.controller;

import com.springboot.sprintboottest.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

@RestController
public class UploadController {
    @Autowired
    UserRepository userRepository;
    @RequestMapping("/user/uploadIcon")
    public String uploadUserIcon(HttpServletRequest request,
                                 HttpSession session,
                                 @RequestParam("icon")MultipartFile icon)
            throws IOException {
        if(icon == null || icon.getSize() <= 0)
            return "FALSE";
        //System.out.println(f.getPath());
        //inputStreamToFile(inputStream, f);
        //String dir = "E:\\本科\\SpringBoot\\sprintboot-test\\serverfs\\img\\usricon\\";
        String dir = (new File("").getAbsolutePath())+"\\serverfs\\img\\usricon\\";
        Object object = request.getSession().getAttribute("UserId");
        Integer userId = Integer.parseInt(object.toString());
        //System.out.println(userId);
        InputStream inputStream = icon.getInputStream();
        String filePath = pathGenerate(userId, dir);
        File f = new File(filePath);
        OutputStream outputStream = new FileOutputStream(f);
        //System.out.println(f.getPath());
        byte[] buffer = new byte[8192];
        Integer bytesRead = 0;
        while ((bytesRead = inputStream.read(buffer, 0, 8192)) != -1) {
            outputStream.write(buffer, 0, bytesRead);
        }
        outputStream.close();
        userRepository.updateImg(filePath.substring(filePath.indexOf("\\serverfs")), userId);
        session.setAttribute("photo", filePath.substring(filePath.indexOf("\\serverfs")));
        return "TRUE";
    }
    public static String pathGenerate(Integer userId,String directory){
        Date date = new Date();
        SimpleDateFormat ft = new SimpleDateFormat ("yyyy-MM-dd-hh-mm-ss");
        //String suffix = new String(originPath.substring(originPath.lastIndexOf('.')));
        String curPath = directory + userId.toString();//+"_"+ft.format(date)+originPath;
        return curPath;
    }
}
