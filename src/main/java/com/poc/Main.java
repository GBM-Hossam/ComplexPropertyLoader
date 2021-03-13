package com.poc;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.FileReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String... args) {
        System.out.println("Start load all exception codes");
        Map<Integer, ExceptionMessageBean> exceptionCodeMap = new HashMap<Integer, ExceptionMessageBean>();
        try {
            //JSONParser parser = new JSONParser();
            //Object obj = parser.parse(new FileReader("c:/ExceptionCodes.json"));
            // JSONArray jsonObject = (JSONArray) obj;
            File exceptionJsonPath = new File("./src/main/resources/ExceptionCodes.json");
            System.out.println(exceptionJsonPath.getAbsolutePath());

            ObjectMapper mapper = new ObjectMapper();
            //JSON file to Java array object
            ExceptionMessageBean[]  exceptionMessages = mapper.readValue(exceptionJsonPath , ExceptionMessageBean[].class);
                    //new FileReader("c:/ExceptionCodes.json"), );
            System.out.println(exceptionMessages.length);
            exceptionCodeMap
                    = Arrays.asList(exceptionMessages).stream()
                    .collect(Collectors.toMap(
                            exceptionMessageBean
                                    -> exceptionMessageBean.getCode(),
                            exceptionMessageBean -> exceptionMessageBean));

            System.out.println(exceptionCodeMap.get(1000));
            System.out.println(exceptionCodeMap.get(1001));
            System.out.println(exceptionCodeMap.get(1002));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
