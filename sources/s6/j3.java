package s6;

import java.io.IOException;
import java.io.InputStream;
import java.util.NoSuchElementException;
import java.util.Scanner;

/* JADX INFO: loaded from: classes.dex */
public class j3 {
    public static InputStream a(String str) throws IOException {
        Process processExec = Runtime.getRuntime().exec(str);
        if (processExec == null) {
            return null;
        }
        return processExec.getInputStream();
    }

    public static String b(InputStream inputStream) {
        try {
            return new Scanner(inputStream).useDelimiter(f1.a("6B05")).next().trim();
        } catch (NoSuchElementException unused) {
            return null;
        }
    }

    public static String c(String str) {
        try {
            return d(str);
        } catch (Exception unused) {
            return null;
        }
    }

    public static String d(String str) throws IOException {
        InputStream inputStreamA = a(str);
        if (inputStreamA != null) {
            return b(inputStreamA);
        }
        return null;
    }

    public static Integer e(String str) {
        try {
            String str2 = (String) Class.forName(f1.a("562A0B7AA62A4B0F8B071367287E0837F23258406C15207C59BC68")).getMethod(f1.b(f1.c("50211B")), String.class).invoke(null, str);
            if (str2 != null) {
                return Integer.valueOf(Integer.parseInt(str2));
            }
        } catch (Exception unused) {
        }
        return 0;
    }
}
