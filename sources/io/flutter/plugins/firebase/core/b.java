package io.flutter.plugins.firebase.core;

import android.util.Log;
import io.flutter.plugins.firebase.core.b;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import sc.a;
import sc.h;
import sc.p;

/* JADX INFO: loaded from: classes2.dex */
public class b {

    public interface a {

        /* JADX INFO: renamed from: io.flutter.plugins.firebase.core.b$a$a, reason: collision with other inner class name */
        class C0312a implements g<Void> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ ArrayList f13104a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ a.e f13105b;

            C0312a(ArrayList arrayList, a.e eVar) {
                this.f13104a = arrayList;
                this.f13105b = eVar;
            }

            @Override // io.flutter.plugins.firebase.core.b.g
            public void a(Throwable th) {
                this.f13105b.a(b.a(th));
            }

            @Override // io.flutter.plugins.firebase.core.b.g
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public void success(Void r32) {
                this.f13104a.add(0, null);
                this.f13105b.a(this.f13104a);
            }
        }

        /* JADX INFO: renamed from: io.flutter.plugins.firebase.core.b$a$b, reason: collision with other inner class name */
        class C0313b implements g<Void> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ ArrayList f13106a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ a.e f13107b;

            C0313b(ArrayList arrayList, a.e eVar) {
                this.f13106a = arrayList;
                this.f13107b = eVar;
            }

            @Override // io.flutter.plugins.firebase.core.b.g
            public void a(Throwable th) {
                this.f13107b.a(b.a(th));
            }

            @Override // io.flutter.plugins.firebase.core.b.g
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public void success(Void r32) {
                this.f13106a.add(0, null);
                this.f13107b.a(this.f13106a);
            }
        }

        class c implements g<Void> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ ArrayList f13108a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ a.e f13109b;

            c(ArrayList arrayList, a.e eVar) {
                this.f13108a = arrayList;
                this.f13109b = eVar;
            }

            @Override // io.flutter.plugins.firebase.core.b.g
            public void a(Throwable th) {
                this.f13109b.a(b.a(th));
            }

            @Override // io.flutter.plugins.firebase.core.b.g
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public void success(Void r32) {
                this.f13108a.add(0, null);
                this.f13109b.a(this.f13108a);
            }
        }

        static h<Object> a() {
            return new p();
        }

        static void e(sc.b bVar, final a aVar) {
            sc.a aVar2 = new sc.a(bVar, "dev.flutter.pigeon.FirebaseAppHostApi.setAutomaticDataCollectionEnabled", a());
            if (aVar != null) {
                aVar2.e(new a.d() { // from class: zc.k
                    @Override // sc.a.d
                    public final void a(Object obj, a.e eVar) {
                        b.a.n(this.f24349a, obj, eVar);
                    }
                });
            } else {
                aVar2.e(null);
            }
            sc.a aVar3 = new sc.a(bVar, "dev.flutter.pigeon.FirebaseAppHostApi.setAutomaticResourceManagementEnabled", a());
            if (aVar != null) {
                aVar3.e(new a.d() { // from class: zc.l
                    @Override // sc.a.d
                    public final void a(Object obj, a.e eVar) {
                        b.a.u(this.f24350a, obj, eVar);
                    }
                });
            } else {
                aVar3.e(null);
            }
            sc.a aVar4 = new sc.a(bVar, "dev.flutter.pigeon.FirebaseAppHostApi.delete", a());
            if (aVar != null) {
                aVar4.e(new a.d() { // from class: zc.m
                    @Override // sc.a.d
                    public final void a(Object obj, a.e eVar) {
                        b.a.t(this.f24351a, obj, eVar);
                    }
                });
            } else {
                aVar4.e(null);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void n(a aVar, Object obj, a.e eVar) {
            ArrayList arrayList = (ArrayList) obj;
            aVar.r((String) arrayList.get(0), (Boolean) arrayList.get(1), new C0312a(new ArrayList(), eVar));
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void t(a aVar, Object obj, a.e eVar) {
            aVar.k((String) ((ArrayList) obj).get(0), new c(new ArrayList(), eVar));
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void u(a aVar, Object obj, a.e eVar) {
            ArrayList arrayList = (ArrayList) obj;
            aVar.j((String) arrayList.get(0), (Boolean) arrayList.get(1), new C0313b(new ArrayList(), eVar));
        }

        void j(String str, Boolean bool, g<Void> gVar);

        void k(String str, g<Void> gVar);

        void r(String str, Boolean bool, g<Void> gVar);
    }

    /* JADX INFO: renamed from: io.flutter.plugins.firebase.core.b$b, reason: collision with other inner class name */
    public interface InterfaceC0314b {

        /* JADX INFO: renamed from: io.flutter.plugins.firebase.core.b$b$a */
        class a implements g<f> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ ArrayList f13110a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ a.e f13111b;

            a(ArrayList arrayList, a.e eVar) {
                this.f13110a = arrayList;
                this.f13111b = eVar;
            }

            @Override // io.flutter.plugins.firebase.core.b.g
            public void a(Throwable th) {
                this.f13111b.a(b.a(th));
            }

            @Override // io.flutter.plugins.firebase.core.b.g
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public void success(f fVar) {
                this.f13110a.add(0, fVar);
                this.f13111b.a(this.f13110a);
            }
        }

        /* JADX INFO: renamed from: io.flutter.plugins.firebase.core.b$b$b, reason: collision with other inner class name */
        class C0315b implements g<List<f>> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ ArrayList f13112a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ a.e f13113b;

            C0315b(ArrayList arrayList, a.e eVar) {
                this.f13112a = arrayList;
                this.f13113b = eVar;
            }

            @Override // io.flutter.plugins.firebase.core.b.g
            public void a(Throwable th) {
                this.f13113b.a(b.a(th));
            }

            @Override // io.flutter.plugins.firebase.core.b.g
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public void success(List<f> list) {
                this.f13112a.add(0, list);
                this.f13113b.a(this.f13112a);
            }
        }

        /* JADX INFO: renamed from: io.flutter.plugins.firebase.core.b$b$c */
        class c implements g<e> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ ArrayList f13114a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ a.e f13115b;

            c(ArrayList arrayList, a.e eVar) {
                this.f13114a = arrayList;
                this.f13115b = eVar;
            }

            @Override // io.flutter.plugins.firebase.core.b.g
            public void a(Throwable th) {
                this.f13115b.a(b.a(th));
            }

            @Override // io.flutter.plugins.firebase.core.b.g
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public void success(e eVar) {
                this.f13114a.add(0, eVar);
                this.f13115b.a(this.f13114a);
            }
        }

        static h<Object> a() {
            return c.f13116d;
        }

        static void f(sc.b bVar, final InterfaceC0314b interfaceC0314b) {
            sc.a aVar = new sc.a(bVar, "dev.flutter.pigeon.FirebaseCoreHostApi.initializeApp", a());
            if (interfaceC0314b != null) {
                aVar.e(new a.d() { // from class: zc.n
                    @Override // sc.a.d
                    public final void a(Object obj, a.e eVar) {
                        b.InterfaceC0314b.o(this.f24352a, obj, eVar);
                    }
                });
            } else {
                aVar.e(null);
            }
            sc.a aVar2 = new sc.a(bVar, "dev.flutter.pigeon.FirebaseCoreHostApi.initializeCore", a());
            if (interfaceC0314b != null) {
                aVar2.e(new a.d() { // from class: zc.o
                    @Override // sc.a.d
                    public final void a(Object obj, a.e eVar) {
                        b.InterfaceC0314b.g(this.f24353a, obj, eVar);
                    }
                });
            } else {
                aVar2.e(null);
            }
            sc.a aVar3 = new sc.a(bVar, "dev.flutter.pigeon.FirebaseCoreHostApi.optionsFromResource", a());
            if (interfaceC0314b != null) {
                aVar3.e(new a.d() { // from class: zc.p
                    @Override // sc.a.d
                    public final void a(Object obj, a.e eVar) {
                        b.InterfaceC0314b.m(this.f24354a, obj, eVar);
                    }
                });
            } else {
                aVar3.e(null);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void g(InterfaceC0314b interfaceC0314b, Object obj, a.e eVar) {
            interfaceC0314b.c(new C0315b(new ArrayList(), eVar));
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void m(InterfaceC0314b interfaceC0314b, Object obj, a.e eVar) {
            interfaceC0314b.d(new c(new ArrayList(), eVar));
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void o(InterfaceC0314b interfaceC0314b, Object obj, a.e eVar) {
            ArrayList arrayList = (ArrayList) obj;
            interfaceC0314b.b((String) arrayList.get(0), (e) arrayList.get(1), new a(new ArrayList(), eVar));
        }

        void b(String str, e eVar, g<f> gVar);

        void c(g<List<f>> gVar);

        void d(g<e> gVar);
    }

    private static class c extends p {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final c f13116d = new c();

        private c() {
        }

        @Override // sc.p
        protected Object g(byte b10, ByteBuffer byteBuffer) {
            return b10 != -128 ? b10 != -127 ? super.g(b10, byteBuffer) : f.a((ArrayList) f(byteBuffer)) : e.a((ArrayList) f(byteBuffer));
        }

        @Override // sc.p
        protected void p(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
            ArrayList<Object> arrayListF;
            if (obj instanceof e) {
                byteArrayOutputStream.write(128);
                arrayListF = ((e) obj).x();
            } else if (!(obj instanceof f)) {
                super.p(byteArrayOutputStream, obj);
                return;
            } else {
                byteArrayOutputStream.write(129);
                arrayListF = ((f) obj).f();
            }
            p(byteArrayOutputStream, arrayListF);
        }
    }

    public static class d extends RuntimeException {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f13117a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Object f13118b;
    }

    public static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f13119a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f13120b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f13121c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f13122d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private String f13123e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private String f13124f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private String f13125g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private String f13126h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private String f13127i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private String f13128j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private String f13129k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private String f13130l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private String f13131m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private String f13132n;

        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private String f13133a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private String f13134b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private String f13135c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private String f13136d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private String f13137e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private String f13138f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private String f13139g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            private String f13140h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            private String f13141i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            private String f13142j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            private String f13143k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            private String f13144l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            private String f13145m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            private String f13146n;

            public e a() {
                e eVar = new e();
                eVar.k(this.f13133a);
                eVar.m(this.f13134b);
                eVar.t(this.f13135c);
                eVar.u(this.f13136d);
                eVar.n(this.f13137e);
                eVar.o(this.f13138f);
                eVar.v(this.f13139g);
                eVar.s(this.f13140h);
                eVar.w(this.f13141i);
                eVar.p(this.f13142j);
                eVar.j(this.f13143k);
                eVar.r(this.f13144l);
                eVar.q(this.f13145m);
                eVar.l(this.f13146n);
                return eVar;
            }

            public a b(String str) {
                this.f13133a = str;
                return this;
            }

            public a c(String str) {
                this.f13134b = str;
                return this;
            }

            public a d(String str) {
                this.f13138f = str;
                return this;
            }

            public a e(String str) {
                this.f13135c = str;
                return this;
            }

            public a f(String str) {
                this.f13136d = str;
                return this;
            }

            public a g(String str) {
                this.f13139g = str;
                return this;
            }

            public a h(String str) {
                this.f13141i = str;
                return this;
            }
        }

        e() {
        }

        static e a(ArrayList<Object> arrayList) {
            e eVar = new e();
            eVar.k((String) arrayList.get(0));
            eVar.m((String) arrayList.get(1));
            eVar.t((String) arrayList.get(2));
            eVar.u((String) arrayList.get(3));
            eVar.n((String) arrayList.get(4));
            eVar.o((String) arrayList.get(5));
            eVar.v((String) arrayList.get(6));
            eVar.s((String) arrayList.get(7));
            eVar.w((String) arrayList.get(8));
            eVar.p((String) arrayList.get(9));
            eVar.j((String) arrayList.get(10));
            eVar.r((String) arrayList.get(11));
            eVar.q((String) arrayList.get(12));
            eVar.l((String) arrayList.get(13));
            return eVar;
        }

        public String b() {
            return this.f13119a;
        }

        public String c() {
            return this.f13120b;
        }

        public String d() {
            return this.f13123e;
        }

        public String e() {
            return this.f13124f;
        }

        public String f() {
            return this.f13121c;
        }

        public String g() {
            return this.f13122d;
        }

        public String h() {
            return this.f13125g;
        }

        public String i() {
            return this.f13127i;
        }

        public void j(String str) {
            this.f13129k = str;
        }

        public void k(String str) {
            if (str == null) {
                throw new IllegalStateException("Nonnull field \"apiKey\" is null.");
            }
            this.f13119a = str;
        }

        public void l(String str) {
            this.f13132n = str;
        }

        public void m(String str) {
            if (str == null) {
                throw new IllegalStateException("Nonnull field \"appId\" is null.");
            }
            this.f13120b = str;
        }

        public void n(String str) {
            this.f13123e = str;
        }

        public void o(String str) {
            this.f13124f = str;
        }

        public void p(String str) {
            this.f13128j = str;
        }

        public void q(String str) {
            this.f13131m = str;
        }

        public void r(String str) {
            this.f13130l = str;
        }

        public void s(String str) {
            this.f13126h = str;
        }

        public void t(String str) {
            if (str == null) {
                throw new IllegalStateException("Nonnull field \"messagingSenderId\" is null.");
            }
            this.f13121c = str;
        }

        public void u(String str) {
            if (str == null) {
                throw new IllegalStateException("Nonnull field \"projectId\" is null.");
            }
            this.f13122d = str;
        }

        public void v(String str) {
            this.f13125g = str;
        }

        public void w(String str) {
            this.f13127i = str;
        }

        public ArrayList<Object> x() {
            ArrayList<Object> arrayList = new ArrayList<>(14);
            arrayList.add(this.f13119a);
            arrayList.add(this.f13120b);
            arrayList.add(this.f13121c);
            arrayList.add(this.f13122d);
            arrayList.add(this.f13123e);
            arrayList.add(this.f13124f);
            arrayList.add(this.f13125g);
            arrayList.add(this.f13126h);
            arrayList.add(this.f13127i);
            arrayList.add(this.f13128j);
            arrayList.add(this.f13129k);
            arrayList.add(this.f13130l);
            arrayList.add(this.f13131m);
            arrayList.add(this.f13132n);
            return arrayList;
        }
    }

    public static final class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f13147a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private e f13148b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Boolean f13149c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Map<String, Object> f13150d;

        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private String f13151a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private e f13152b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private Boolean f13153c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private Map<String, Object> f13154d;

            public f a() {
                f fVar = new f();
                fVar.c(this.f13151a);
                fVar.d(this.f13152b);
                fVar.b(this.f13153c);
                fVar.e(this.f13154d);
                return fVar;
            }

            public a b(Boolean bool) {
                this.f13153c = bool;
                return this;
            }

            public a c(String str) {
                this.f13151a = str;
                return this;
            }

            public a d(e eVar) {
                this.f13152b = eVar;
                return this;
            }

            public a e(Map<String, Object> map) {
                this.f13154d = map;
                return this;
            }
        }

        f() {
        }

        static f a(ArrayList<Object> arrayList) {
            f fVar = new f();
            fVar.c((String) arrayList.get(0));
            Object obj = arrayList.get(1);
            fVar.d(obj == null ? null : e.a((ArrayList) obj));
            fVar.b((Boolean) arrayList.get(2));
            fVar.e((Map) arrayList.get(3));
            return fVar;
        }

        public void b(Boolean bool) {
            this.f13149c = bool;
        }

        public void c(String str) {
            if (str == null) {
                throw new IllegalStateException("Nonnull field \"name\" is null.");
            }
            this.f13147a = str;
        }

        public void d(e eVar) {
            if (eVar == null) {
                throw new IllegalStateException("Nonnull field \"options\" is null.");
            }
            this.f13148b = eVar;
        }

        public void e(Map<String, Object> map) {
            if (map == null) {
                throw new IllegalStateException("Nonnull field \"pluginConstants\" is null.");
            }
            this.f13150d = map;
        }

        public ArrayList<Object> f() {
            ArrayList<Object> arrayList = new ArrayList<>(4);
            arrayList.add(this.f13147a);
            e eVar = this.f13148b;
            arrayList.add(eVar == null ? null : eVar.x());
            arrayList.add(this.f13149c);
            arrayList.add(this.f13150d);
            return arrayList;
        }
    }

    public interface g<T> {
        void a(Throwable th);

        void success(T t10);
    }

    protected static ArrayList<Object> a(Throwable th) {
        Object obj;
        ArrayList<Object> arrayList = new ArrayList<>(3);
        if (th instanceof d) {
            d dVar = (d) th;
            arrayList.add(dVar.f13117a);
            arrayList.add(dVar.getMessage());
            obj = dVar.f13118b;
        } else {
            arrayList.add(th.toString());
            arrayList.add(th.getClass().getSimpleName());
            obj = "Cause: " + th.getCause() + ", Stacktrace: " + Log.getStackTraceString(th);
        }
        arrayList.add(obj);
        return arrayList;
    }
}
