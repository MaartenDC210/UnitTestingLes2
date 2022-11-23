package ex06_likeIt_OBF;

public class LikeItSimple {

    public String displayLikes(String[] names) {
        if (names == null) return "";

        int numberOfLikes = names.length;
        String likeThis = " like this";
        switch (numberOfLikes){
            case 0:
                return "no one likes this :-(";
            case 1:
                return names[0] + " likes this";
            case 2:
                return names[0] + " and " + names[1] + likeThis;
            case 3:
                return names[0] + ", " + names[1] + " and " + names[2] + likeThis;
            default:
                return names[0] + ", " + names[1] + " and " + (names.length - 2) + " others" + likeThis;
        }
    }
}
