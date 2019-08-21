/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.io.IOException;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

/**
 *
 * @author 1894264
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        JSONObject mainObject = new JSONObject();
        mainObject.accumulate("id", 12346);
        mainObject.accumulate("fname", "Parag");
        mainObject.accumulate("Lname", "Dangariya");
        mainObject.accumulate("Active", true);
        mainObject.accumulate("gpa", 3.4);

        JSONObject address = new JSONObject();
        address.accumulate("number", 1001);
        address.accumulate("Street", "Sherbrooke");
        address.accumulate("Zipcode", "H3JDE2");

        mainObject.accumulate("address", address);

        JSONArray phones = new JSONArray();

        phones.add("5144622535");
        phones.add("5144656565");
        phones.add("5144655535");

        mainObject.accumulate("phones", phones);

        JSONArray result = new JSONArray();
        JSONObject singleResult = new JSONObject();

        singleResult.accumulate("title", "DATABASE");
        singleResult.accumulate("mark", 3.4);
        result.add(singleResult);
        singleResult.clear();
        singleResult.accumulate("title", "Debugging");
        singleResult.accumulate("mark", 3.4);
        result.add(singleResult);
        singleResult.clear();
        singleResult.accumulate("title", "java");
        singleResult.accumulate("mark", 3.4);
        result.add(singleResult);
        mainObject.accumulate("result", result);

        System.out.println(mainObject);
        FileWriter.saveStringIntoFile("json/student.json", mainObject.toString());
    }

}
