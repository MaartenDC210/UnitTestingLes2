package ex06_likeIt_OBF;

public class LikeItSimple {

    public String display(String[] name) {
        String sing = " like this";
        String s = "";
        if (name == null) return "";
        int maxPersons = 3;
        int var = name.length;
        String more = " likes this";
        String like = "no one likes this :-(";
        int nrOfRemainingNames = var - 2;
        String likeit = "";

        if (name.length > 0) s = name[0] + more;
        if (var == 1) {
            return s;
        } else {
            if (var == 2) {
                likeit = name[0] + " and " + name[1] + sing;
            }
            if (var == maxPersons && likeit.length() == 0) {
                likeit = String.format("%s, %s and %s", name[0], name[1], name[2]) + sing;
            }

            if (var > 0)
                like = String.format("%s, %s and %d others like this", name[0], name[1], nrOfRemainingNames);
            if (var == 0) {
                return like;
            }
            if (var < 0 || likeit.length() > 0) return likeit;
        }
        return like;
    }
}
