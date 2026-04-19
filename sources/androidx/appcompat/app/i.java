package androidx.appcompat.app;

import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import androidx.appcompat.app.d;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
class i {

    static class a implements Executor {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Object f1060a = new Object();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Queue<Runnable> f1061b = new ArrayDeque();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final Executor f1062c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Runnable f1063d;

        a(Executor executor) {
            this.f1062c = executor;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void c(Runnable runnable) {
            try {
                runnable.run();
            } finally {
                d();
            }
        }

        protected void d() {
            synchronized (this.f1060a) {
                Runnable runnablePoll = this.f1061b.poll();
                this.f1063d = runnablePoll;
                if (runnablePoll != null) {
                    this.f1062c.execute(runnablePoll);
                }
            }
        }

        @Override // java.util.concurrent.Executor
        public void execute(final Runnable runnable) {
            synchronized (this.f1060a) {
                this.f1061b.add(new Runnable() { // from class: androidx.appcompat.app.h
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f1058a.c(runnable);
                    }
                });
                if (this.f1063d == null) {
                    d();
                }
            }
        }
    }

    static class b implements Executor {
        b() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            new Thread(runnable).start();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x004f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static void a(android.content.Context r6, java.lang.String r7) {
        /*
            java.lang.String r0 = "locales"
            java.lang.String r1 = "AppLocalesStorageHelper"
            java.lang.String r2 = ""
            boolean r2 = r7.equals(r2)
            java.lang.String r3 = "androidx.appcompat.app.AppCompatDelegate.application_locales_record_file"
            if (r2 == 0) goto L12
            r6.deleteFile(r3)
            return
        L12:
            r2 = 0
            java.io.FileOutputStream r6 = r6.openFileOutput(r3, r2)     // Catch: java.io.FileNotFoundException -> L74
            org.xmlpull.v1.XmlSerializer r2 = android.util.Xml.newSerializer()
            r3 = 0
            r2.setOutput(r6, r3)     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L55
            java.lang.String r4 = "UTF-8"
            java.lang.Boolean r5 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L55
            r2.startDocument(r4, r5)     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L55
            r2.startTag(r3, r0)     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L55
            java.lang.String r4 = "application_locales"
            r2.attribute(r3, r4, r7)     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L55
            r2.endTag(r3, r0)     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L55
            r2.endDocument()     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L55
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L55
            r0.<init>()     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L55
            java.lang.String r2 = "Storing App Locales : app-locales: "
            r0.append(r2)     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L55
            r0.append(r7)     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L55
            java.lang.String r2 = " persisted successfully."
            r0.append(r2)     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L55
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L55
            android.util.Log.d(r1, r0)     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L55
            if (r6 == 0) goto L6d
        L4f:
            r6.close()     // Catch: java.io.IOException -> L6d
            goto L6d
        L53:
            r7 = move-exception
            goto L6e
        L55:
            r0 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L53
            r2.<init>()     // Catch: java.lang.Throwable -> L53
            java.lang.String r3 = "Storing App Locales : Failed to persist app-locales: "
            r2.append(r3)     // Catch: java.lang.Throwable -> L53
            r2.append(r7)     // Catch: java.lang.Throwable -> L53
            java.lang.String r7 = r2.toString()     // Catch: java.lang.Throwable -> L53
            android.util.Log.w(r1, r7, r0)     // Catch: java.lang.Throwable -> L53
            if (r6 == 0) goto L6d
            goto L4f
        L6d:
            return
        L6e:
            if (r6 == 0) goto L73
            r6.close()     // Catch: java.io.IOException -> L73
        L73:
            throw r7
        L74:
            r6 = 1
            java.lang.Object[] r6 = new java.lang.Object[r6]
            r6[r2] = r3
            java.lang.String r7 = "Storing App Locales : FileNotFoundException: Cannot open file %s for writing "
            java.lang.String r6 = java.lang.String.format(r7, r6)
            android.util.Log.w(r1, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.i.a(android.content.Context, java.lang.String):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0039, code lost:
    
        r2 = r4.getAttributeValue(null, "application_locales");
     */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0042 A[EXC_TOP_SPLITTER, PHI: r2
  0x0042: PHI (r2v2 java.lang.String) = (r2v0 java.lang.String), (r2v4 java.lang.String) binds: [B:24:0x004d, B:18:0x0040] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static java.lang.String b(android.content.Context r9) {
        /*
            java.lang.String r0 = "androidx.appcompat.app.AppCompatDelegate.application_locales_record_file"
            java.lang.String r1 = "AppLocalesStorageHelper"
            java.lang.String r2 = ""
            java.io.FileInputStream r3 = r9.openFileInput(r0)     // Catch: java.io.FileNotFoundException -> L75
            org.xmlpull.v1.XmlPullParser r4 = android.util.Xml.newPullParser()     // Catch: java.lang.Throwable -> L46 java.lang.Throwable -> L48
            java.lang.String r5 = "UTF-8"
            r4.setInput(r3, r5)     // Catch: java.lang.Throwable -> L46 java.lang.Throwable -> L48
            int r5 = r4.getDepth()     // Catch: java.lang.Throwable -> L46 java.lang.Throwable -> L48
        L17:
            int r6 = r4.next()     // Catch: java.lang.Throwable -> L46 java.lang.Throwable -> L48
            r7 = 1
            if (r6 == r7) goto L40
            r7 = 3
            if (r6 != r7) goto L27
            int r8 = r4.getDepth()     // Catch: java.lang.Throwable -> L46 java.lang.Throwable -> L48
            if (r8 <= r5) goto L40
        L27:
            if (r6 == r7) goto L17
            r7 = 4
            if (r6 != r7) goto L2d
            goto L17
        L2d:
            java.lang.String r6 = r4.getName()     // Catch: java.lang.Throwable -> L46 java.lang.Throwable -> L48
            java.lang.String r7 = "locales"
            boolean r6 = r6.equals(r7)     // Catch: java.lang.Throwable -> L46 java.lang.Throwable -> L48
            if (r6 == 0) goto L17
            r5 = 0
            java.lang.String r6 = "application_locales"
            java.lang.String r2 = r4.getAttributeValue(r5, r6)     // Catch: java.lang.Throwable -> L46 java.lang.Throwable -> L48
        L40:
            if (r3 == 0) goto L50
        L42:
            r3.close()     // Catch: java.io.IOException -> L50
            goto L50
        L46:
            r9 = move-exception
            goto L6f
        L48:
            java.lang.String r4 = "Reading app Locales : Unable to parse through file :androidx.appcompat.app.AppCompatDelegate.application_locales_record_file"
            android.util.Log.w(r1, r4)     // Catch: java.lang.Throwable -> L46
            if (r3 == 0) goto L50
            goto L42
        L50:
            boolean r3 = r2.isEmpty()
            if (r3 != 0) goto L6b
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r0 = "Reading app Locales : Locales read from file: androidx.appcompat.app.AppCompatDelegate.application_locales_record_file , appLocales: "
            r9.append(r0)
            r9.append(r2)
            java.lang.String r9 = r9.toString()
            android.util.Log.d(r1, r9)
            goto L6e
        L6b:
            r9.deleteFile(r0)
        L6e:
            return r2
        L6f:
            if (r3 == 0) goto L74
            r3.close()     // Catch: java.io.IOException -> L74
        L74:
            throw r9
        L75:
            java.lang.String r9 = "Reading app Locales : Locales record file not found: androidx.appcompat.app.AppCompatDelegate.application_locales_record_file"
            android.util.Log.w(r1, r9)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.i.b(android.content.Context):java.lang.String");
    }

    static void c(Context context) {
        if (Build.VERSION.SDK_INT >= 33) {
            ComponentName componentName = new ComponentName(context, "androidx.appcompat.app.AppLocalesMetadataHolderService");
            if (context.getPackageManager().getComponentEnabledSetting(componentName) != 1) {
                if (d.k().f()) {
                    String strB = b(context);
                    Object systemService = context.getSystemService("locale");
                    if (systemService != null) {
                        d.b.b(systemService, d.a.a(strB));
                    }
                }
                context.getPackageManager().setComponentEnabledSetting(componentName, 1, 1);
            }
        }
    }
}
