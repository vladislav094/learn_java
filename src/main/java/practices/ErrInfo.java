package practices;

class Err {
    String msg;
    int severity;

    Err(String m, int s) {
        msg = m;
        severity = s;
    }
}

class ErrorInfo {
    String msgs[] = {
            "Ошибка вывода",
            "Ошибка ввода",
            "Отсутствует место на диске",
            "Выход индекса за границы диапазона",
    };

    int howbad[] = {3, 3, 2, 4};

    Err getErrorMsg(int i) {
        if( i >= 0 & i < msgs.length)
            return new Err(msgs[i], howbad[i]);
        else
            return new Err("Несуществующий код ошибки", 0);
    }
}
public class ErrInfo {
    public static void main(String args[]) {
        ErrorInfo err = new ErrorInfo();
        Err e;
        e = err.getErrorMsg(2);
        System.out.println(e.msg + " level: " + e.severity);
        e = err.getErrorMsg(19);
        System.out.println(e.msg + " level: " + e.severity);
    }
}