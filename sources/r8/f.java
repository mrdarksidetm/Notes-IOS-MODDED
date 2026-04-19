package r8;

import com.google.android.gms.common.api.Status;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

/* JADX INFO: loaded from: classes.dex */
public final class f implements Runnable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final z8.a f19220c = new z8.a("RevokeAccessOperation", new String[0]);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f19221a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final v8.m f19222b = new v8.m(null);

    public f(String str) {
        this.f19221a = w8.m.e(str);
    }

    public static u8.d a(String str) {
        if (str == null) {
            return u8.e.a(new Status(4), null);
        }
        f fVar = new f(str);
        new Thread(fVar).start();
        return fVar.f19222b;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Status status = Status.f8387h;
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL("https://accounts.google.com/o/oauth2/revoke?token=" + this.f19221a).openConnection();
            httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode == 200) {
                status = Status.f8385f;
            } else {
                f19220c.c("Unable to revoke access!", new Object[0]);
            }
            f19220c.a("Response Code: " + responseCode, new Object[0]);
        } catch (IOException e10) {
            f19220c.c("IOException when revoking access: ".concat(String.valueOf(e10.toString())), new Object[0]);
        } catch (Exception e11) {
            f19220c.c("Exception when revoking access: ".concat(String.valueOf(e11.toString())), new Object[0]);
        }
        this.f19222b.setResult(status);
    }
}
