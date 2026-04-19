package yf;

import android.app.Activity;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import android.provider.MediaStore;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import jc.a;
import sc.i;
import sc.j;
import sc.n;

/* JADX INFO: loaded from: classes2.dex */
public class g implements jc.a, j.c, kc.a, n {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Uri f24028e = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Uri f24029f = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final boolean f24030g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private j f24031a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private a.b f24032b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Activity f24033c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Runnable f24034d;

    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ j.d f24035a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ i f24036b;

        a(j.d dVar, i iVar) {
            this.f24035a = dVar;
            this.f24036b = iVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f24035a.success(Boolean.valueOf(g.this.l(((Boolean) this.f24036b.a("toAlbum")).booleanValue())));
        }
    }

    static {
        f24030g = Build.VERSION.SDK_INT <= 29;
    }

    private ContentValues i(boolean z10, String str, String str2, String str3) {
        String string;
        ContentValues contentValues = new ContentValues();
        String str4 = (z10 || str3 != null) ? Environment.DIRECTORY_PICTURES : Environment.DIRECTORY_MOVIES;
        String str5 = "";
        if (f24030g) {
            File externalStoragePublicDirectory = Environment.getExternalStoragePublicDirectory(str4);
            if (str3 == null) {
                str3 = "";
            }
            File file = new File(externalStoragePublicDirectory, str3);
            if (!file.exists()) {
                file.mkdirs();
            }
            String str6 = file.getPath() + File.separator + str;
            int i10 = 0;
            while (true) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str6);
                sb2.append(i10 == 0 ? "" : Integer.valueOf(i10));
                sb2.append(str2);
                string = sb2.toString();
                if (!new File(string).exists()) {
                    break;
                }
                i10++;
            }
            contentValues.put("_data", string);
        } else {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(str4);
            if (str3 != null) {
                str5 = File.separator + str3;
            }
            sb3.append(str5);
            contentValues.put("relative_path", sb3.toString());
        }
        contentValues.put("_display_name", str + str2);
        return contentValues;
    }

    private Uri j(ContentResolver contentResolver, ContentValues contentValues, boolean z10, String str, String str2) {
        int i10 = 0;
        while (true) {
            try {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(i10 > 0 ? Integer.valueOf(i10) : "");
                sb2.append(str2);
                contentValues.put("_display_name", sb2.toString());
                return contentResolver.insert(z10 ? f24028e : f24029f, contentValues);
            } catch (IllegalStateException e10) {
                if (!e10.getMessage().contains("Failed to build unique file")) {
                    throw e10;
                }
                i10++;
            }
        }
    }

    private void k(Exception exc, j.d dVar) {
        w(((exc instanceof SecurityException) || exc.toString().contains("Permission denied")) ? "ACCESS_DENIED" : exc instanceof FileNotFoundException ? "NOT_SUPPORTED_FORMAT" : ((exc instanceof IOException) && exc.toString().contains("No space left on device")) ? "NOT_ENOUGH_SPACE" : "UNEXPECTED", exc.toString(), exc.getStackTrace(), dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean l(boolean z10) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 > 29) {
            return true;
        }
        return (i10 == 29 && !z10) || androidx.core.content.a.checkSelfPermission(this.f24032b.a(), "android.permission.WRITE_EXTERNAL_STORAGE") == 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void n(i iVar, final j.d dVar) {
        try {
            t((String) iVar.a("path"), (String) iVar.a("album"), iVar.f20503a.contains("Image"));
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: yf.e
                @Override // java.lang.Runnable
                public final void run() {
                    dVar.success(null);
                }
            });
        } catch (Exception e10) {
            k(e10, dVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void p(i iVar, final j.d dVar) {
        try {
            u((byte[]) iVar.a("bytes"), (String) iVar.a("album"), (String) iVar.a("name"));
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: yf.d
                @Override // java.lang.Runnable
                public final void run() {
                    dVar.success(null);
                }
            });
        } catch (Exception e10) {
            k(e10, dVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void r(j.d dVar, String str, String str2, StringBuilder sb2) {
        dVar.error(str, str2, sb2.toString());
    }

    private void s() {
        Intent intent = new Intent();
        intent.setAction("android.intent.action.VIEW");
        intent.setData(f24028e);
        intent.setFlags(268435456);
        this.f24032b.a().startActivity(intent);
    }

    private void t(String str, String str2, boolean z10) throws IOException {
        File file = new File(str);
        String name = file.getName();
        int iLastIndexOf = name.lastIndexOf(46);
        if (iLastIndexOf == -1) {
            throw new FileNotFoundException("Extension not found.");
        }
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            x(fileInputStream, z10, name.substring(0, iLastIndexOf), name.substring(iLastIndexOf), str2);
            fileInputStream.close();
        } catch (Throwable th) {
            try {
                fileInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    private void u(byte[] bArr, String str, String str2) throws IOException {
        String str3 = "." + jf.e.e(bArr).a().toLowerCase();
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        try {
            x(byteArrayInputStream, true, str2, str3, str);
            byteArrayInputStream.close();
        } catch (Throwable th) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    private void v() {
        androidx.core.app.a.g(this.f24033c, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 1317298);
    }

    private void w(final String str, final String str2, StackTraceElement[] stackTraceElementArr, final j.d dVar) {
        final StringBuilder sb2 = new StringBuilder();
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            sb2.append(stackTraceElement.toString());
            sb2.append("\n");
        }
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: yf.f
            @Override // java.lang.Runnable
            public final void run() {
                g.r(dVar, str, str2, sb2);
            }
        });
    }

    private void x(InputStream inputStream, boolean z10, String str, String str2, String str3) throws IOException {
        ContentResolver contentResolver = this.f24032b.a().getContentResolver();
        OutputStream outputStreamOpenOutputStream = contentResolver.openOutputStream(j(contentResolver, i(z10, str, str2, str3), z10, str, str2));
        try {
            byte[] bArr = new byte[8192];
            while (true) {
                int i10 = inputStream.read(bArr);
                if (i10 == -1) {
                    break;
                } else {
                    outputStreamOpenOutputStream.write(bArr, 0, i10);
                }
            }
            if (outputStreamOpenOutputStream != null) {
                outputStreamOpenOutputStream.close();
            }
        } catch (Throwable th) {
            if (outputStreamOpenOutputStream != null) {
                try {
                    outputStreamOpenOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // sc.n
    public boolean d(int i10, String[] strArr, int[] iArr) {
        if (i10 != 1317298 || iArr.length == 0) {
            return false;
        }
        new Handler(Looper.getMainLooper()).post(this.f24034d);
        this.f24034d = null;
        return true;
    }

    @Override // kc.a
    public void onAttachedToActivity(kc.c cVar) {
        this.f24033c = cVar.getActivity();
        cVar.a(this);
    }

    @Override // jc.a
    public void onAttachedToEngine(a.b bVar) {
        j jVar = new j(bVar.b(), "gal");
        this.f24031a = jVar;
        jVar.e(this);
        this.f24032b = bVar;
    }

    @Override // kc.a
    public void onDetachedFromActivity() {
        this.f24033c = null;
    }

    @Override // kc.a
    public void onDetachedFromActivityForConfigChanges() {
        this.f24033c = null;
    }

    @Override // jc.a
    public void onDetachedFromEngine(a.b bVar) {
        this.f24031a.e(null);
        this.f24032b = null;
    }

    @Override // sc.j.c
    public void onMethodCall(final i iVar, final j.d dVar) {
        Thread thread;
        String str = iVar.f20503a;
        str.hashCode();
        switch (str) {
            case "hasAccess":
                dVar.success(Boolean.valueOf(l(((Boolean) iVar.a("toAlbum")).booleanValue())));
                return;
            case "open":
                s();
                new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: yf.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        dVar.success(null);
                    }
                });
                return;
            case "requestAccess":
                if (l(((Boolean) iVar.a("toAlbum")).booleanValue())) {
                    dVar.success(Boolean.TRUE);
                    return;
                } else {
                    this.f24034d = new a(dVar, iVar);
                    v();
                    return;
                }
            case "putImage":
            case "putVideo":
                thread = new Thread(new Runnable() { // from class: yf.a
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f24015a.n(iVar, dVar);
                    }
                });
                break;
            case "putImageBytes":
                thread = new Thread(new Runnable() { // from class: yf.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f24018a.p(iVar, dVar);
                    }
                });
                break;
            default:
                dVar.notImplemented();
                return;
        }
        thread.start();
    }

    @Override // kc.a
    public void onReattachedToActivityForConfigChanges(kc.c cVar) {
        this.f24033c = cVar.getActivity();
        cVar.a(this);
    }
}
