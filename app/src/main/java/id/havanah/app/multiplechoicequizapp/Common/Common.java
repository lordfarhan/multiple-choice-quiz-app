package id.havanah.app.multiplechoicequizapp.Common;

import java.util.ArrayList;
import java.util.List;

import id.havanah.app.multiplechoicequizapp.Model.Category;
import id.havanah.app.multiplechoicequizapp.Model.CurrentQuestion;
import id.havanah.app.multiplechoicequizapp.Model.Question;

public class Common {

    public static final int TOTAL_TIME = 20*60*1000;
    public static List<Question> questionList = new ArrayList<>();
    public static List<CurrentQuestion> answerSheetList = new ArrayList<>();
    public static Category selectedCategory = new Category();
    public enum ANSWER_TYPE{
        NO_ANSWER,
        WRONG_ANSWER,
        RIGHT_ANSWER
    }

}
