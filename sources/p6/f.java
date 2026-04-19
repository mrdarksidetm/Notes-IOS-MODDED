package p6;

import ae.r;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Base64;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;
import md.t;
import md.u;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f18255a = new f();

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String[] f18256a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String[] f18257b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String[][] f18258c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final String[] f18259d;

        public a(String[] strArr, String[] strArr2, String[][] strArr3, String[] strArr4) {
            r.f(strArr, "blacklistedPackageNames");
            r.f(strArr2, "blacklistedHashes");
            r.f(strArr3, "suspiciousPermissions");
            r.f(strArr4, "whitelistedInstallationSources");
            this.f18256a = strArr;
            this.f18257b = strArr2;
            this.f18258c = strArr3;
            this.f18259d = strArr4;
        }

        public final String[] a() {
            return this.f18257b;
        }

        public final String[] b() {
            return this.f18256a;
        }

        public final String[][] c() {
            return this.f18258c;
        }

        public final String[] d() {
            return this.f18259d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return r.b(this.f18256a, aVar.f18256a) && r.b(this.f18257b, aVar.f18257b) && r.b(this.f18258c, aVar.f18258c) && r.b(this.f18259d, aVar.f18259d);
        }

        public int hashCode() {
            return (((((Arrays.hashCode(this.f18256a) * 31) + Arrays.hashCode(this.f18257b)) * 31) + Arrays.hashCode(this.f18258c)) * 31) + Arrays.hashCode(this.f18259d);
        }

        public String toString() {
            return "MalwareConfig(blacklistedPackageNames=" + Arrays.toString(this.f18256a) + ", blacklistedHashes=" + Arrays.toString(this.f18257b) + ", suspiciousPermissions=" + Arrays.toString(this.f18258c) + ", whitelistedInstallationSources=" + Arrays.toString(this.f18259d) + ')';
        }
    }

    private f() {
    }

    private final Bitmap a(Drawable drawable) {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth() > 0 ? drawable.getIntrinsicWidth() : 1, drawable.getIntrinsicHeight() > 0 ? drawable.getIntrinsicHeight() : 1, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);
        r.c(bitmapCreateBitmap);
        return bitmapCreateBitmap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:131:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x03af  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01dc A[PHI: r5
  0x01dc: PHI (r5v1 int A[IMMUTABLE_TYPE]) = (r5v0 int), (r5v16 int) binds: [B:47:0x0109, B:84:0x01da] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final p6.f.a d(org.json.JSONObject r18) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 954
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p6.f.d(org.json.JSONObject):p6.f$a");
    }

    private final String e(Bitmap bitmap) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.PNG, 10, byteArrayOutputStream);
        String strEncodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
        r.e(strEncodeToString, "encodeToString(...)");
        return strEncodeToString;
    }

    private final Bitmap f(Drawable drawable) {
        if (!(drawable instanceof BitmapDrawable)) {
            return a(drawable);
        }
        Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
        r.e(bitmap, "getBitmap(...)");
        return bitmap;
    }

    public final String b(Context context, String str) {
        r.f(context, "context");
        r.f(str, "packageName");
        try {
            t.a aVar = t.f15576b;
            return Build.VERSION.SDK_INT >= 30 ? context.getPackageManager().getInstallSourceInfo(str).getInstallingPackageName() : context.getPackageManager().getInstallerPackageName(str);
        } catch (Throwable th) {
            t.a aVar2 = t.f15576b;
            t.b(u.a(th));
            return null;
        }
    }

    public final String c(Context context, String str) {
        Object objB;
        r.f(context, "context");
        r.f(str, "packageName");
        try {
            t.a aVar = t.f15576b;
            Drawable applicationIcon = context.getPackageManager().getApplicationIcon(str);
            r.e(applicationIcon, "getApplicationIcon(...)");
            objB = t.b(e(f(applicationIcon)));
        } catch (Throwable th) {
            t.a aVar2 = t.f15576b;
            objB = t.b(u.a(th));
        }
        if (t.g(objB)) {
            objB = null;
        }
        return (String) objB;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:48:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01ff  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final t6.e g(java.lang.String r20) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 591
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p6.f.g(java.lang.String):t6.e");
    }
}
