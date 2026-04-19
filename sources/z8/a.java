package z8;

import android.util.Log;
import com.amazon.a.a.o.b.f;
import java.util.Locale;
import w8.e;

/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f24296a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f24297b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e f24298c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f24299d;

    public a(String str, String... strArr) {
        String string;
        if (strArr.length == 0) {
            string = "";
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append('[');
            for (String str2 : strArr) {
                if (sb2.length() > 1) {
                    sb2.append(f.f7478a);
                }
                sb2.append(str2);
            }
            sb2.append("] ");
            string = sb2.toString();
        }
        this.f24297b = string;
        this.f24296a = str;
        this.f24298c = new e(str);
        int i10 = 2;
        while (i10 <= 7 && !Log.isLoggable(this.f24296a, i10)) {
            i10++;
        }
        this.f24299d = i10;
    }

    public void a(String str, Object... objArr) {
        if (f(3)) {
            Log.d(this.f24296a, d(str, objArr));
        }
    }

    public void b(String str, Throwable th, Object... objArr) {
        Log.e(this.f24296a, d(str, objArr), th);
    }

    public void c(String str, Object... objArr) {
        Log.e(this.f24296a, d(str, objArr));
    }

    protected String d(String str, Object... objArr) {
        if (objArr != null && objArr.length > 0) {
            str = String.format(Locale.US, str, objArr);
        }
        return this.f24297b.concat(str);
    }

    public void e(String str, Object... objArr) {
        Log.i(this.f24296a, d(str, objArr));
    }

    public boolean f(int i10) {
        return this.f24299d <= i10;
    }

    public void g(String str, Object... objArr) {
        if (f(2)) {
            Log.v(this.f24296a, d(str, objArr));
        }
    }

    public void h(String str, Object... objArr) {
        Log.w(this.f24296a, d(str, objArr));
    }

    public void i(String str, Throwable th, Object... objArr) {
        Log.wtf(this.f24296a, d(str, objArr), th);
    }

    public void j(Throwable th) {
        Log.wtf(this.f24296a, th);
    }
}
