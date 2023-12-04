/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package healthconnect;

/**
 *
 * @author yonas
 */
public class Exercise {

    private String freeTime;
    private String activityLevel;

    public Exercise(String freeTime, String activityLevel) {
        this.freeTime = freeTime;
        this.activityLevel = activityLevel;
    }

    public String getFreeTime() {
        return freeTime;
    }

    public String getActivityLevel() {
        return activityLevel;
    }
}
