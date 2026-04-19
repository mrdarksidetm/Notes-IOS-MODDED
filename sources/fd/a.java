package fd;

import android.util.Log;
import fd.a;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Map;
import java.util.Objects;
import sc.a;
import sc.p;

/* JADX INFO: loaded from: classes2.dex */
public class a {

    /* JADX INFO: renamed from: fd.a$a, reason: collision with other inner class name */
    public static final class C0270a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Boolean f11214a;

        C0270a() {
        }

        static C0270a a(ArrayList<Object> arrayList) {
            C0270a c0270a = new C0270a();
            c0270a.c((Boolean) arrayList.get(0));
            return c0270a;
        }

        public Boolean b() {
            return this.f11214a;
        }

        public void c(Boolean bool) {
            if (bool == null) {
                throw new IllegalStateException("Nonnull field \"showTitle\" is null.");
            }
            this.f11214a = bool;
        }

        ArrayList<Object> d() {
            ArrayList<Object> arrayList = new ArrayList<>(1);
            arrayList.add(this.f11214a);
            return arrayList;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C0270a.class != obj.getClass()) {
                return false;
            }
            return this.f11214a.equals(((C0270a) obj).f11214a);
        }

        public int hashCode() {
            return Objects.hash(this.f11214a);
        }
    }

    public static class b extends RuntimeException {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f11215a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Object f11216b;

        public b(String str, String str2, Object obj) {
            super(str2);
            this.f11215a = str;
            this.f11216b = obj;
        }
    }

    private static class c extends p {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final c f11217d = new c();

        private c() {
        }

        @Override // sc.p
        protected Object g(byte b10, ByteBuffer byteBuffer) {
            return b10 != -127 ? b10 != -126 ? super.g(b10, byteBuffer) : C0270a.a((ArrayList) f(byteBuffer)) : e.a((ArrayList) f(byteBuffer));
        }

        @Override // sc.p
        protected void p(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
            ArrayList<Object> arrayListD;
            if (obj instanceof e) {
                byteArrayOutputStream.write(129);
                arrayListD = ((e) obj).h();
            } else if (!(obj instanceof C0270a)) {
                super.p(byteArrayOutputStream, obj);
                return;
            } else {
                byteArrayOutputStream.write(130);
                arrayListD = ((C0270a) obj).d();
            }
            p(byteArrayOutputStream, arrayListD);
        }
    }

    public interface d {
        static sc.h<Object> a() {
            return c.f11217d;
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void d(d dVar, Object obj, a.e eVar) {
            ArrayList<Object> arrayList = new ArrayList<>();
            ArrayList arrayList2 = (ArrayList) obj;
            try {
                arrayList.add(0, dVar.g((String) arrayList2.get(0), (Boolean) arrayList2.get(1), (e) arrayList2.get(2), (C0270a) arrayList2.get(3)));
            } catch (Throwable th) {
                arrayList = a.a(th);
            }
            eVar.a(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void f(d dVar, Object obj, a.e eVar) {
            ArrayList<Object> arrayList = new ArrayList<>();
            try {
                arrayList.add(0, dVar.h());
            } catch (Throwable th) {
                arrayList = a.a(th);
            }
            eVar.a(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void i(d dVar, Object obj, a.e eVar) {
            ArrayList<Object> arrayList = new ArrayList<>();
            try {
                arrayList.add(0, dVar.e((String) ((ArrayList) obj).get(0)));
            } catch (Throwable th) {
                arrayList = a.a(th);
            }
            eVar.a(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void j(d dVar, Object obj, a.e eVar) {
            ArrayList<Object> arrayList = new ArrayList<>();
            ArrayList arrayList2 = (ArrayList) obj;
            try {
                arrayList.add(0, dVar.n((String) arrayList2.get(0), (Map) arrayList2.get(1)));
            } catch (Throwable th) {
                arrayList = a.a(th);
            }
            eVar.a(arrayList);
        }

        static void l(sc.b bVar, d dVar) {
            r(bVar, "", dVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void o(d dVar, Object obj, a.e eVar) {
            ArrayList<Object> arrayList = new ArrayList<>();
            try {
                dVar.m();
                arrayList.add(0, null);
            } catch (Throwable th) {
                arrayList = a.a(th);
            }
            eVar.a(arrayList);
        }

        static void r(sc.b bVar, String str, final d dVar) {
            String str2;
            if (str.isEmpty()) {
                str2 = "";
            } else {
                str2 = "." + str;
            }
            sc.a aVar = new sc.a(bVar, "dev.flutter.pigeon.url_launcher_android.UrlLauncherApi.canLaunchUrl" + str2, a());
            if (dVar != null) {
                aVar.e(new a.d() { // from class: fd.b
                    @Override // sc.a.d
                    public final void a(Object obj, a.e eVar) {
                        a.d.i(this.f11221a, obj, eVar);
                    }
                });
            } else {
                aVar.e(null);
            }
            sc.a aVar2 = new sc.a(bVar, "dev.flutter.pigeon.url_launcher_android.UrlLauncherApi.launchUrl" + str2, a());
            if (dVar != null) {
                aVar2.e(new a.d() { // from class: fd.c
                    @Override // sc.a.d
                    public final void a(Object obj, a.e eVar) {
                        a.d.j(this.f11222a, obj, eVar);
                    }
                });
            } else {
                aVar2.e(null);
            }
            sc.a aVar3 = new sc.a(bVar, "dev.flutter.pigeon.url_launcher_android.UrlLauncherApi.openUrlInApp" + str2, a());
            if (dVar != null) {
                aVar3.e(new a.d() { // from class: fd.d
                    @Override // sc.a.d
                    public final void a(Object obj, a.e eVar) {
                        a.d.d(this.f11223a, obj, eVar);
                    }
                });
            } else {
                aVar3.e(null);
            }
            sc.a aVar4 = new sc.a(bVar, "dev.flutter.pigeon.url_launcher_android.UrlLauncherApi.supportsCustomTabs" + str2, a());
            if (dVar != null) {
                aVar4.e(new a.d() { // from class: fd.e
                    @Override // sc.a.d
                    public final void a(Object obj, a.e eVar) {
                        a.d.f(this.f11224a, obj, eVar);
                    }
                });
            } else {
                aVar4.e(null);
            }
            sc.a aVar5 = new sc.a(bVar, "dev.flutter.pigeon.url_launcher_android.UrlLauncherApi.closeWebView" + str2, a());
            if (dVar != null) {
                aVar5.e(new a.d() { // from class: fd.f
                    @Override // sc.a.d
                    public final void a(Object obj, a.e eVar) {
                        a.d.o(this.f11225a, obj, eVar);
                    }
                });
            } else {
                aVar5.e(null);
            }
        }

        Boolean e(String str);

        Boolean g(String str, Boolean bool, e eVar, C0270a c0270a);

        Boolean h();

        void m();

        Boolean n(String str, Map<String, String> map);
    }

    public static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Boolean f11218a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Boolean f11219b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Map<String, String> f11220c;

        e() {
        }

        static e a(ArrayList<Object> arrayList) {
            e eVar = new e();
            eVar.f((Boolean) arrayList.get(0));
            eVar.e((Boolean) arrayList.get(1));
            eVar.g((Map) arrayList.get(2));
            return eVar;
        }

        public Boolean b() {
            return this.f11219b;
        }

        public Boolean c() {
            return this.f11218a;
        }

        public Map<String, String> d() {
            return this.f11220c;
        }

        public void e(Boolean bool) {
            if (bool == null) {
                throw new IllegalStateException("Nonnull field \"enableDomStorage\" is null.");
            }
            this.f11219b = bool;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || e.class != obj.getClass()) {
                return false;
            }
            e eVar = (e) obj;
            return this.f11218a.equals(eVar.f11218a) && this.f11219b.equals(eVar.f11219b) && this.f11220c.equals(eVar.f11220c);
        }

        public void f(Boolean bool) {
            if (bool == null) {
                throw new IllegalStateException("Nonnull field \"enableJavaScript\" is null.");
            }
            this.f11218a = bool;
        }

        public void g(Map<String, String> map) {
            if (map == null) {
                throw new IllegalStateException("Nonnull field \"headers\" is null.");
            }
            this.f11220c = map;
        }

        ArrayList<Object> h() {
            ArrayList<Object> arrayList = new ArrayList<>(3);
            arrayList.add(this.f11218a);
            arrayList.add(this.f11219b);
            arrayList.add(this.f11220c);
            return arrayList;
        }

        public int hashCode() {
            return Objects.hash(this.f11218a, this.f11219b, this.f11220c);
        }
    }

    protected static ArrayList<Object> a(Throwable th) {
        Object obj;
        ArrayList<Object> arrayList = new ArrayList<>(3);
        if (th instanceof b) {
            b bVar = (b) th;
            arrayList.add(bVar.f11215a);
            arrayList.add(bVar.getMessage());
            obj = bVar.f11216b;
        } else {
            arrayList.add(th.toString());
            arrayList.add(th.getClass().getSimpleName());
            obj = "Cause: " + th.getCause() + ", Stacktrace: " + Log.getStackTraceString(th);
        }
        arrayList.add(obj);
        return arrayList;
    }
}
