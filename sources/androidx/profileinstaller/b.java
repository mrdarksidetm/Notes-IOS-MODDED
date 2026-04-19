package androidx.profileinstaller;

import android.content.res.AssetManager;
import android.os.Build;
import androidx.profileinstaller.f;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AssetManager f4487a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Executor f4488b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final f.c f4489c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final File f4491e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f4492f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f4493g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f4494h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private c[] f4496j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private byte[] f4497k;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f4495i = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final byte[] f4490d = d();

    public b(AssetManager assetManager, Executor executor, f.c cVar, String str, String str2, String str3, File file) {
        this.f4487a = assetManager;
        this.f4488b = executor;
        this.f4489c = cVar;
        this.f4492f = str;
        this.f4493g = str2;
        this.f4494h = str3;
        this.f4491e = file;
    }

    private b b(c[] cVarArr, byte[] bArr) {
        f.c cVar;
        int i10;
        InputStream inputStreamH;
        try {
            inputStreamH = h(this.f4487a, this.f4494h);
        } catch (FileNotFoundException e10) {
            e = e10;
            cVar = this.f4489c;
            i10 = 9;
            cVar.b(i10, e);
            return null;
        } catch (IOException e11) {
            e = e11;
            cVar = this.f4489c;
            i10 = 7;
            cVar.b(i10, e);
            return null;
        } catch (IllegalStateException e12) {
            e = e12;
            this.f4496j = null;
            cVar = this.f4489c;
            i10 = 8;
            cVar.b(i10, e);
            return null;
        }
        if (inputStreamH == null) {
            if (inputStreamH != null) {
                inputStreamH.close();
            }
            return null;
        }
        try {
            this.f4496j = h.q(inputStreamH, h.o(inputStreamH, h.f4518b), bArr, cVarArr);
            inputStreamH.close();
            return this;
        } finally {
        }
    }

    private void c() {
        if (!this.f4495i) {
            throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
        }
    }

    private static byte[] d() {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 > 34) {
            return null;
        }
        switch (i10) {
        }
        return null;
    }

    private InputStream f(AssetManager assetManager) {
        f.c cVar;
        int i10;
        try {
            return h(assetManager, this.f4493g);
        } catch (FileNotFoundException e10) {
            e = e10;
            cVar = this.f4489c;
            i10 = 6;
            cVar.b(i10, e);
            return null;
        } catch (IOException e11) {
            e = e11;
            cVar = this.f4489c;
            i10 = 7;
            cVar.b(i10, e);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g(int i10, Object obj) {
        this.f4489c.b(i10, obj);
    }

    private InputStream h(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e10) {
            String message = e10.getMessage();
            if (message == null || !message.contains("compressed")) {
                return null;
            }
            this.f4489c.a(5, null);
            return null;
        }
    }

    private c[] j(InputStream inputStream) {
        try {
            try {
                try {
                    c[] cVarArrW = h.w(inputStream, h.o(inputStream, h.f4517a), this.f4492f);
                    try {
                        inputStream.close();
                        return cVarArrW;
                    } catch (IOException e10) {
                        this.f4489c.b(7, e10);
                        return cVarArrW;
                    }
                } catch (IOException e11) {
                    this.f4489c.b(7, e11);
                    inputStream.close();
                    return null;
                } catch (IllegalStateException e12) {
                    this.f4489c.b(8, e12);
                    inputStream.close();
                    return null;
                }
            } catch (Throwable th) {
                try {
                    inputStream.close();
                } catch (IOException e13) {
                    this.f4489c.b(7, e13);
                }
                throw th;
            }
        } catch (IOException e14) {
            this.f4489c.b(7, e14);
        }
    }

    private static boolean k() {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 > 34) {
            return false;
        }
        if (i10 != 24 && i10 != 25) {
            switch (i10) {
            }
            return false;
        }
        return true;
    }

    private void l(final int i10, final Object obj) {
        this.f4488b.execute(new Runnable() { // from class: v4.a
            @Override // java.lang.Runnable
            public final void run() {
                this.f22026a.g(i10, obj);
            }
        });
    }

    public boolean e() {
        if (this.f4490d == null) {
            l(3, Integer.valueOf(Build.VERSION.SDK_INT));
            return false;
        }
        if (!this.f4491e.exists()) {
            try {
                this.f4491e.createNewFile();
            } catch (IOException unused) {
                l(4, null);
                return false;
            }
        } else if (!this.f4491e.canWrite()) {
            l(4, null);
            return false;
        }
        this.f4495i = true;
        return true;
    }

    public b i() {
        b bVarB;
        c();
        if (this.f4490d == null) {
            return this;
        }
        InputStream inputStreamF = f(this.f4487a);
        if (inputStreamF != null) {
            this.f4496j = j(inputStreamF);
        }
        c[] cVarArr = this.f4496j;
        return (cVarArr == null || !k() || (bVarB = b(cVarArr, this.f4490d)) == null) ? this : bVarB;
    }

    public b m() {
        f.c cVar;
        int i10;
        ByteArrayOutputStream byteArrayOutputStream;
        c[] cVarArr = this.f4496j;
        byte[] bArr = this.f4490d;
        if (cVarArr != null && bArr != null) {
            c();
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
            } catch (IOException e10) {
                e = e10;
                cVar = this.f4489c;
                i10 = 7;
                cVar.b(i10, e);
            } catch (IllegalStateException e11) {
                e = e11;
                cVar = this.f4489c;
                i10 = 8;
                cVar.b(i10, e);
            }
            try {
                h.E(byteArrayOutputStream, bArr);
                if (!h.B(byteArrayOutputStream, bArr, cVarArr)) {
                    this.f4489c.b(5, null);
                    this.f4496j = null;
                    byteArrayOutputStream.close();
                    return this;
                }
                this.f4497k = byteArrayOutputStream.toByteArray();
                byteArrayOutputStream.close();
                this.f4496j = null;
            } catch (Throwable th) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        return this;
    }

    public boolean n() {
        byte[] bArr = this.f4497k;
        if (bArr == null) {
            return false;
        }
        c();
        try {
            try {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(this.f4491e);
                    try {
                        d.l(byteArrayInputStream, fileOutputStream);
                        l(1, null);
                        fileOutputStream.close();
                        byteArrayInputStream.close();
                        return true;
                    } finally {
                    }
                } catch (Throwable th) {
                    try {
                        byteArrayInputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (FileNotFoundException e10) {
                l(6, e10);
                return false;
            } catch (IOException e11) {
                l(7, e11);
                return false;
            }
        } finally {
            this.f4497k = null;
            this.f4496j = null;
        }
    }
}
