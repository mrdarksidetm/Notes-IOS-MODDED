package com.amazon.a.a.b;

import android.app.Application;
import com.amazon.a.a.c.f;
import com.amazon.a.a.k.d;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FilenameFilter;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

/* JADX INFO: loaded from: classes.dex */
public class b implements a, d, Thread.UncaughtExceptionHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final com.amazon.a.a.o.c f7085a = new com.amazon.a.a.o.c("CrashManagerImpl");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f7086b = "s-";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f7087c = ".amzst";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f7088d = 99999;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f7089e = 5;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @com.amazon.a.a.k.a
    private f f7090f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @com.amazon.a.a.k.a
    private Application f7091g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Thread.UncaughtExceptionHandler f7092h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Map<c, String> f7093i = new HashMap();

    private String a(c cVar) {
        return com.amazon.a.a.o.c.a.a(cVar);
    }

    private synchronized void a(String str) {
        FileOutputStream fileOutputStreamOpenFileOutput = null;
        try {
            try {
                fileOutputStreamOpenFileOutput = this.f7091g.openFileOutput(f7086b + new Random().nextInt(f7088d) + f7087c, 0);
                fileOutputStreamOpenFileOutput.write(str.getBytes());
            } catch (Exception e10) {
                if (com.amazon.a.a.o.c.f7484b) {
                    f7085a.b("Coud not save crash report to file", e10);
                }
            }
        } finally {
        }
    }

    private void a(Throwable th) {
        try {
            a(a(new c(this.f7091g, th)));
        } catch (Throwable th2) {
            if (com.amazon.a.a.o.c.f7484b) {
                f7085a.b("Could not handle uncaught exception", th2);
            }
        }
    }

    private c b(String str) {
        try {
            return (c) com.amazon.a.a.o.c.a.a(c(str));
        } catch (Exception unused) {
            if (!com.amazon.a.a.o.c.f7484b) {
                return null;
            }
            f7085a.b("Failed to load crash report: " + str);
            return null;
        }
    }

    private void b() {
        if (Thread.getDefaultUncaughtExceptionHandler() instanceof a) {
            return;
        }
        if (com.amazon.a.a.o.c.f7483a) {
            f7085a.a("Registering Crash Handler");
        }
        this.f7092h = Thread.getDefaultUncaughtExceptionHandler();
        Thread.setDefaultUncaughtExceptionHandler(this);
    }

    private String c(String str) throws Throwable {
        StringBuilder sb2 = new StringBuilder();
        BufferedReader bufferedReader = null;
        try {
            BufferedReader bufferedReader2 = new BufferedReader(new FileReader(str));
            while (bufferedReader2.ready()) {
                try {
                    sb2.append(bufferedReader2.readLine());
                } catch (Throwable th) {
                    th = th;
                    bufferedReader = bufferedReader2;
                    com.amazon.a.a.o.a.a(bufferedReader);
                    throw th;
                }
            }
            com.amazon.a.a.o.a.a(bufferedReader2);
            return sb2.toString();
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private boolean c() {
        return this.f7093i.size() >= 5;
    }

    private void d(String str) {
        try {
            new File(str).delete();
        } catch (Exception e10) {
            if (com.amazon.a.a.o.c.f7484b) {
                f7085a.b("Cannot delete file: " + str, e10);
            }
        }
    }

    private String[] d() {
        return new File(this.f7091g.getFilesDir().getAbsolutePath() + "/").list(new FilenameFilter() { // from class: com.amazon.a.a.b.b.1
            @Override // java.io.FilenameFilter
            public boolean accept(File file, String str) {
                return str.endsWith(b.f7087c) && !b.this.f7093i.containsValue(str);
            }
        });
    }

    private String e(String str) {
        return this.f7091g.getFilesDir().getAbsolutePath() + "/" + str;
    }

    @Override // com.amazon.a.a.b.a
    public List<c> a() {
        if (c()) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        String[] strArrD = d();
        for (int i10 = 0; i10 < strArrD.length && !c(); i10++) {
            String strE = e(strArrD[i10]);
            c cVarB = b(strE);
            if (cVarB != null) {
                this.f7093i.put(cVarB, strE);
                arrayList.add(cVarB);
            } else {
                d(strE);
            }
        }
        return arrayList;
    }

    @Override // com.amazon.a.a.b.a
    public void a(List<c> list) {
        for (c cVar : list) {
            d(this.f7093i.get(cVar));
            this.f7093i.remove(cVar);
        }
    }

    @Override // com.amazon.a.a.k.d
    public void e() {
        com.amazon.a.a.o.a.a.a();
        b();
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) {
        if (com.amazon.a.a.o.c.f7483a) {
            f7085a.a("Crash detected", th);
        }
        try {
            a(th);
            this.f7090f.a(new com.amazon.a.a.b.a.a());
        } catch (Throwable th2) {
            if (com.amazon.a.a.o.c.f7483a) {
                f7085a.a("Error occured while handling exception", th2);
            }
        }
        if (com.amazon.a.a.o.c.f7483a) {
            f7085a.a("Calling previous handler");
        }
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f7092h;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th);
        }
    }
}
