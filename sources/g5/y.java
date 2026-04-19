package g5;

import android.content.Context;
import android.util.TypedValue;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPInputStream;

/* JADX INFO: loaded from: classes.dex */
public class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f11487a;

    public y(Context context) {
        this.f11487a = context;
    }

    public static String a(File file) throws IOException {
        String canonicalPath = file.getCanonicalPath();
        if (canonicalPath.endsWith("/")) {
            return canonicalPath;
        }
        return canonicalPath + "/";
    }

    public static File b(File file, String str) throws IOException {
        String strA = a(file);
        String canonicalPath = new File(file, str).getCanonicalPath();
        if (canonicalPath.startsWith(strA)) {
            return new File(canonicalPath);
        }
        return null;
    }

    public static File c(Context context) {
        return c.e(context);
    }

    private int d(String str, String str2) {
        return this.f11487a.getResources().getIdentifier(str2, str, this.f11487a.getPackageName());
    }

    private int e(int i10) {
        TypedValue typedValue = new TypedValue();
        this.f11487a.getResources().getValue(i10, typedValue, true);
        return typedValue.type;
    }

    public static String f(String str) {
        String strA = d0.a(str);
        return strA == null ? "text/plain" : strA;
    }

    private static InputStream g(String str, InputStream inputStream) {
        return str.endsWith(".svgz") ? new GZIPInputStream(inputStream) : inputStream;
    }

    public static InputStream i(File file) {
        return g(file.getPath(), new FileInputStream(file));
    }

    private static String k(String str) {
        return (str.length() <= 1 || str.charAt(0) != '/') ? str : str.substring(1);
    }

    public InputStream h(String str) {
        String strK = k(str);
        return g(strK, this.f11487a.getAssets().open(strK, 2));
    }

    public InputStream j(String str) throws IOException {
        String strK = k(str);
        String[] strArrSplit = strK.split("/", -1);
        if (strArrSplit.length != 2) {
            throw new IllegalArgumentException("Incorrect resource path: " + strK);
        }
        String str2 = strArrSplit[0];
        String strSubstring = strArrSplit[1];
        int iLastIndexOf = strSubstring.lastIndexOf(46);
        if (iLastIndexOf != -1) {
            strSubstring = strSubstring.substring(0, iLastIndexOf);
        }
        int iD = d(str2, strSubstring);
        int iE = e(iD);
        if (iE == 3) {
            return g(strK, this.f11487a.getResources().openRawResource(iD));
        }
        throw new IOException(String.format("Expected %s resource to be of TYPE_STRING but was %d", strK, Integer.valueOf(iE)));
    }
}
