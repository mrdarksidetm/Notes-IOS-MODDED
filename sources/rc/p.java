package rc;

import android.annotation.SuppressLint;
import android.os.Build;
import android.util.DisplayMetrics;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;
import sc.a;

/* JADX INFO: loaded from: classes2.dex */
public class p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final a f19390b = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sc.a<Object> f19391a;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ConcurrentLinkedQueue<b> f19392a = new ConcurrentLinkedQueue<>();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private b f19393b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private b f19394c;

        /* JADX INFO: renamed from: rc.p$a$a, reason: collision with other inner class name */
        class C0407a implements a.e {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ b f19395a;

            C0407a(b bVar) {
                this.f19395a = bVar;
            }

            @Override // sc.a.e
            public void a(Object obj) {
                a.this.f19392a.remove(this.f19395a);
                if (a.this.f19392a.isEmpty()) {
                    return;
                }
                cc.b.b("SettingsChannel", "The queue becomes empty after removing config generation " + String.valueOf(this.f19395a.f19398a));
            }
        }

        public static class b {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private static int f19397c = Integer.MIN_VALUE;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f19398a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final DisplayMetrics f19399b;

            public b(DisplayMetrics displayMetrics) {
                int i10 = f19397c;
                f19397c = i10 + 1;
                this.f19398a = i10;
                this.f19399b = displayMetrics;
            }
        }

        public a.e b(b bVar) {
            this.f19392a.add(bVar);
            b bVar2 = this.f19394c;
            this.f19394c = bVar;
            if (bVar2 == null) {
                return null;
            }
            return new C0407a(bVar2);
        }

        public b c(int i10) {
            b bVar;
            StringBuilder sb2;
            String strValueOf;
            if (this.f19393b == null) {
                this.f19393b = this.f19392a.poll();
            }
            while (true) {
                bVar = this.f19393b;
                if (bVar == null || bVar.f19398a >= i10) {
                    break;
                }
                this.f19393b = this.f19392a.poll();
            }
            if (bVar == null) {
                sb2 = new StringBuilder();
                sb2.append("Cannot find config with generation: ");
                sb2.append(String.valueOf(i10));
                strValueOf = ", after exhausting the queue.";
            } else {
                if (bVar.f19398a == i10) {
                    return bVar;
                }
                sb2 = new StringBuilder();
                sb2.append("Cannot find config with generation: ");
                sb2.append(String.valueOf(i10));
                sb2.append(", the oldest config is now: ");
                strValueOf = String.valueOf(this.f19393b.f19398a);
            }
            sb2.append(strValueOf);
            cc.b.b("SettingsChannel", sb2.toString());
            return null;
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final sc.a<Object> f19400a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Map<String, Object> f19401b = new HashMap();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private DisplayMetrics f19402c;

        b(sc.a<Object> aVar) {
            this.f19400a = aVar;
        }

        public void a() {
            cc.b.f("SettingsChannel", "Sending message: \ntextScaleFactor: " + this.f19401b.get("textScaleFactor") + "\nalwaysUse24HourFormat: " + this.f19401b.get("alwaysUse24HourFormat") + "\nplatformBrightness: " + this.f19401b.get("platformBrightness"));
            DisplayMetrics displayMetrics = this.f19402c;
            if (!p.c() || displayMetrics == null) {
                this.f19400a.c(this.f19401b);
                return;
            }
            a.b bVar = new a.b(displayMetrics);
            a.e<Object> eVarB = p.f19390b.b(bVar);
            this.f19401b.put("configurationId", Integer.valueOf(bVar.f19398a));
            this.f19400a.d(this.f19401b, eVarB);
        }

        public b b(boolean z10) {
            this.f19401b.put("brieflyShowPassword", Boolean.valueOf(z10));
            return this;
        }

        public b c(DisplayMetrics displayMetrics) {
            this.f19402c = displayMetrics;
            return this;
        }

        public b d(boolean z10) {
            this.f19401b.put("nativeSpellCheckServiceDefined", Boolean.valueOf(z10));
            return this;
        }

        public b e(c cVar) {
            this.f19401b.put("platformBrightness", cVar.f19406a);
            return this;
        }

        public b f(float f10) {
            this.f19401b.put("textScaleFactor", Float.valueOf(f10));
            return this;
        }

        public b g(boolean z10) {
            this.f19401b.put("alwaysUse24HourFormat", Boolean.valueOf(z10));
            return this;
        }
    }

    public enum c {
        light("light"),
        dark("dark");


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f19406a;

        c(String str) {
            this.f19406a = str;
        }
    }

    public p(fc.a aVar) {
        this.f19391a = new sc.a<>(aVar, "flutter/settings", sc.e.f20501a);
    }

    public static DisplayMetrics b(int i10) {
        a.b bVarC = f19390b.c(i10);
        if (bVarC == null) {
            return null;
        }
        return bVarC.f19399b;
    }

    @SuppressLint({"AnnotateVersionCheck"})
    public static boolean c() {
        return Build.VERSION.SDK_INT >= 34;
    }

    public b d() {
        return new b(this.f19391a);
    }
}
