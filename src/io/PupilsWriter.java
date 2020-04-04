package io;

import enity.Pupil;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class PupilsWriter {
private static final String[] headers={"First name","Last name","Sex","Average mark"};
public static void write (List<Pupil> pupils) {
    String headersString = renderHeader();

    try (FileWriter writer = new FileWriter(IOConstants.FILENAME)) {
        writer.write(headersString);
        for (Pupil pupil: pupils){
            String pupilTxt=toTxtString(pupil);
            writer.write(pupilTxt);
        }
    } catch (IOException e) {
        e.printStackTrace();
    }
}
private static String renderHeader(){
    return String.join(IOConstants.DELIMITER, headers);

}
private static String toTxtString(Pupil pupil){
    return "\n"+pupil.getFirstName()+IOConstants.DELIMITER+
            pupil.getLastName()+IOConstants.DELIMITER+
            pupil.getSex()+IOConstants.DELIMITER+
            pupil.getAverageMark();


}
}
