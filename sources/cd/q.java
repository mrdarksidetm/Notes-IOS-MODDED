package cd;

import android.util.Log;
import cd.q;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import sc.a;

/* JADX INFO: loaded from: classes2.dex */
public class q {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f6867a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f6868b;

        /* JADX INFO: renamed from: cd.q$a$a, reason: collision with other inner class name */
        public static final class C0159a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private String f6869a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private String f6870b;

            public a a() {
                a aVar = new a();
                aVar.b(this.f6869a);
                aVar.c(this.f6870b);
                return aVar;
            }

            public C0159a b(String str) {
                this.f6869a = str;
                return this;
            }

            public C0159a c(String str) {
                this.f6870b = str;
                return this;
            }
        }

        a() {
        }

        static a a(ArrayList<Object> arrayList) {
            a aVar = new a();
            aVar.b((String) arrayList.get(0));
            aVar.c((String) arrayList.get(1));
            return aVar;
        }

        public void b(String str) {
            if (str == null) {
                throw new IllegalStateException("Nonnull field \"code\" is null.");
            }
            this.f6867a = str;
        }

        public void c(String str) {
            this.f6868b = str;
        }

        ArrayList<Object> d() {
            ArrayList<Object> arrayList = new ArrayList<>(2);
            arrayList.add(this.f6867a);
            arrayList.add(this.f6868b);
            return arrayList;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.f6867a.equals(aVar.f6867a) && Objects.equals(this.f6868b, aVar.f6868b);
        }

        public int hashCode() {
            return Objects.hash(this.f6867a, this.f6868b);
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private c f6871a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private a f6872b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private List<String> f6873c;

        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private c f6874a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private a f6875b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private List<String> f6876c;

            public b a() {
                b bVar = new b();
                bVar.d(this.f6874a);
                bVar.b(this.f6875b);
                bVar.c(this.f6876c);
                return bVar;
            }

            public a b(a aVar) {
                this.f6875b = aVar;
                return this;
            }

            public a c(List<String> list) {
                this.f6876c = list;
                return this;
            }

            public a d(c cVar) {
                this.f6874a = cVar;
                return this;
            }
        }

        b() {
        }

        static b a(ArrayList<Object> arrayList) {
            b bVar = new b();
            bVar.d((c) arrayList.get(0));
            bVar.b((a) arrayList.get(1));
            bVar.c((List) arrayList.get(2));
            return bVar;
        }

        public void b(a aVar) {
            this.f6872b = aVar;
        }

        public void c(List<String> list) {
            if (list == null) {
                throw new IllegalStateException("Nonnull field \"paths\" is null.");
            }
            this.f6873c = list;
        }

        public void d(c cVar) {
            if (cVar == null) {
                throw new IllegalStateException("Nonnull field \"type\" is null.");
            }
            this.f6871a = cVar;
        }

        ArrayList<Object> e() {
            ArrayList<Object> arrayList = new ArrayList<>(3);
            arrayList.add(this.f6871a);
            arrayList.add(this.f6872b);
            arrayList.add(this.f6873c);
            return arrayList;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || b.class != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            return this.f6871a.equals(bVar.f6871a) && Objects.equals(this.f6872b, bVar.f6872b) && this.f6873c.equals(bVar.f6873c);
        }

        public int hashCode() {
            return Objects.hash(this.f6871a, this.f6872b, this.f6873c);
        }
    }

    public enum c {
        IMAGE(0),
        VIDEO(1);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final int f6880a;

        c(int i10) {
            this.f6880a = i10;
        }
    }

    public static class d extends RuntimeException {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f6881a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Object f6882b;

        public d(String str, String str2, Object obj) {
            super(str2);
            this.f6881a = str;
            this.f6882b = obj;
        }
    }

    public static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Boolean f6883a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Boolean f6884b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Long f6885c;

        e() {
        }

        static e a(ArrayList<Object> arrayList) {
            e eVar = new e();
            eVar.e((Boolean) arrayList.get(0));
            eVar.g((Boolean) arrayList.get(1));
            eVar.f((Long) arrayList.get(2));
            return eVar;
        }

        public Boolean b() {
            return this.f6883a;
        }

        public Long c() {
            return this.f6885c;
        }

        public Boolean d() {
            return this.f6884b;
        }

        public void e(Boolean bool) {
            if (bool == null) {
                throw new IllegalStateException("Nonnull field \"allowMultiple\" is null.");
            }
            this.f6883a = bool;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || e.class != obj.getClass()) {
                return false;
            }
            e eVar = (e) obj;
            return this.f6883a.equals(eVar.f6883a) && this.f6884b.equals(eVar.f6884b) && Objects.equals(this.f6885c, eVar.f6885c);
        }

        public void f(Long l10) {
            this.f6885c = l10;
        }

        public void g(Boolean bool) {
            if (bool == null) {
                throw new IllegalStateException("Nonnull field \"usePhotoPicker\" is null.");
            }
            this.f6884b = bool;
        }

        ArrayList<Object> h() {
            ArrayList<Object> arrayList = new ArrayList<>(3);
            arrayList.add(this.f6883a);
            arrayList.add(this.f6884b);
            arrayList.add(this.f6885c);
            return arrayList;
        }

        public int hashCode() {
            return Objects.hash(this.f6883a, this.f6884b, this.f6885c);
        }
    }

    public interface f {

        class a implements j<List<String>> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ ArrayList f6886a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ a.e f6887b;

            a(ArrayList arrayList, a.e eVar) {
                this.f6886a = arrayList;
                this.f6887b = eVar;
            }

            @Override // cd.q.j
            public void a(Throwable th) {
                this.f6887b.a(q.a(th));
            }

            @Override // cd.q.j
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public void success(List<String> list) {
                this.f6886a.add(0, list);
                this.f6887b.a(this.f6886a);
            }
        }

        class b implements j<List<String>> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ ArrayList f6888a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ a.e f6889b;

            b(ArrayList arrayList, a.e eVar) {
                this.f6888a = arrayList;
                this.f6889b = eVar;
            }

            @Override // cd.q.j
            public void a(Throwable th) {
                this.f6889b.a(q.a(th));
            }

            @Override // cd.q.j
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public void success(List<String> list) {
                this.f6888a.add(0, list);
                this.f6889b.a(this.f6888a);
            }
        }

        class c implements j<List<String>> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ ArrayList f6890a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ a.e f6891b;

            c(ArrayList arrayList, a.e eVar) {
                this.f6890a = arrayList;
                this.f6891b = eVar;
            }

            @Override // cd.q.j
            public void a(Throwable th) {
                this.f6891b.a(q.a(th));
            }

            @Override // cd.q.j
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public void success(List<String> list) {
                this.f6890a.add(0, list);
                this.f6891b.a(this.f6890a);
            }
        }

        static sc.h<Object> a() {
            return i.f6896d;
        }

        static void d(sc.b bVar, f fVar) {
            n(bVar, "", fVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void e(f fVar, Object obj, a.e eVar) {
            ArrayList arrayList = (ArrayList) obj;
            fVar.c((l) arrayList.get(0), (g) arrayList.get(1), (e) arrayList.get(2), new a(new ArrayList(), eVar));
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void k(f fVar, Object obj, a.e eVar) {
            ArrayList arrayList = (ArrayList) obj;
            fVar.f((h) arrayList.get(0), (e) arrayList.get(1), new c(new ArrayList(), eVar));
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void l(f fVar, Object obj, a.e eVar) {
            ArrayList arrayList = (ArrayList) obj;
            fVar.o((l) arrayList.get(0), (n) arrayList.get(1), (e) arrayList.get(2), new b(new ArrayList(), eVar));
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void m(f fVar, Object obj, a.e eVar) {
            ArrayList<Object> arrayList = new ArrayList<>();
            try {
                arrayList.add(0, fVar.i());
            } catch (Throwable th) {
                arrayList = q.a(th);
            }
            eVar.a(arrayList);
        }

        static void n(sc.b bVar, String str, final f fVar) {
            String str2;
            if (str.isEmpty()) {
                str2 = "";
            } else {
                str2 = "." + str;
            }
            sc.a aVar = new sc.a(bVar, "dev.flutter.pigeon.image_picker_android.ImagePickerApi.pickImages" + str2, a(), bVar.c());
            if (fVar != null) {
                aVar.e(new a.d() { // from class: cd.r
                    @Override // sc.a.d
                    public final void a(Object obj, a.e eVar) {
                        q.f.e(this.f6908a, obj, eVar);
                    }
                });
            } else {
                aVar.e(null);
            }
            sc.a aVar2 = new sc.a(bVar, "dev.flutter.pigeon.image_picker_android.ImagePickerApi.pickVideos" + str2, a(), bVar.c());
            if (fVar != null) {
                aVar2.e(new a.d() { // from class: cd.s
                    @Override // sc.a.d
                    public final void a(Object obj, a.e eVar) {
                        q.f.l(this.f6909a, obj, eVar);
                    }
                });
            } else {
                aVar2.e(null);
            }
            sc.a aVar3 = new sc.a(bVar, "dev.flutter.pigeon.image_picker_android.ImagePickerApi.pickMedia" + str2, a());
            if (fVar != null) {
                aVar3.e(new a.d() { // from class: cd.t
                    @Override // sc.a.d
                    public final void a(Object obj, a.e eVar) {
                        q.f.k(this.f6910a, obj, eVar);
                    }
                });
            } else {
                aVar3.e(null);
            }
            sc.a aVar4 = new sc.a(bVar, "dev.flutter.pigeon.image_picker_android.ImagePickerApi.retrieveLostResults" + str2, a(), bVar.c());
            if (fVar != null) {
                aVar4.e(new a.d() { // from class: cd.u
                    @Override // sc.a.d
                    public final void a(Object obj, a.e eVar) {
                        q.f.m(this.f6911a, obj, eVar);
                    }
                });
            } else {
                aVar4.e(null);
            }
        }

        void c(l lVar, g gVar, e eVar, j<List<String>> jVar);

        void f(h hVar, e eVar, j<List<String>> jVar);

        b i();

        void o(l lVar, n nVar, e eVar, j<List<String>> jVar);
    }

    public static final class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Double f6892a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Double f6893b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Long f6894c;

        g() {
        }

        static g a(ArrayList<Object> arrayList) {
            g gVar = new g();
            gVar.f((Double) arrayList.get(0));
            gVar.e((Double) arrayList.get(1));
            gVar.g((Long) arrayList.get(2));
            return gVar;
        }

        public Double b() {
            return this.f6893b;
        }

        public Double c() {
            return this.f6892a;
        }

        public Long d() {
            return this.f6894c;
        }

        public void e(Double d10) {
            this.f6893b = d10;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || g.class != obj.getClass()) {
                return false;
            }
            g gVar = (g) obj;
            return Objects.equals(this.f6892a, gVar.f6892a) && Objects.equals(this.f6893b, gVar.f6893b) && this.f6894c.equals(gVar.f6894c);
        }

        public void f(Double d10) {
            this.f6892a = d10;
        }

        public void g(Long l10) {
            if (l10 == null) {
                throw new IllegalStateException("Nonnull field \"quality\" is null.");
            }
            this.f6894c = l10;
        }

        ArrayList<Object> h() {
            ArrayList<Object> arrayList = new ArrayList<>(3);
            arrayList.add(this.f6892a);
            arrayList.add(this.f6893b);
            arrayList.add(this.f6894c);
            return arrayList;
        }

        public int hashCode() {
            return Objects.hash(this.f6892a, this.f6893b, this.f6894c);
        }
    }

    public static final class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private g f6895a;

        h() {
        }

        static h a(ArrayList<Object> arrayList) {
            h hVar = new h();
            hVar.c((g) arrayList.get(0));
            return hVar;
        }

        public g b() {
            return this.f6895a;
        }

        public void c(g gVar) {
            if (gVar == null) {
                throw new IllegalStateException("Nonnull field \"imageSelectionOptions\" is null.");
            }
            this.f6895a = gVar;
        }

        ArrayList<Object> d() {
            ArrayList<Object> arrayList = new ArrayList<>(1);
            arrayList.add(this.f6895a);
            return arrayList;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || h.class != obj.getClass()) {
                return false;
            }
            return this.f6895a.equals(((h) obj).f6895a);
        }

        public int hashCode() {
            return Objects.hash(this.f6895a);
        }
    }

    private static class i extends sc.p {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final i f6896d = new i();

        private i() {
        }

        @Override // sc.p
        protected Object g(byte b10, ByteBuffer byteBuffer) {
            switch (b10) {
                case -127:
                    Object objF = f(byteBuffer);
                    if (objF == null) {
                        return null;
                    }
                    return k.values()[((Long) objF).intValue()];
                case -126:
                    Object objF2 = f(byteBuffer);
                    if (objF2 == null) {
                        return null;
                    }
                    return m.values()[((Long) objF2).intValue()];
                case -125:
                    Object objF3 = f(byteBuffer);
                    if (objF3 == null) {
                        return null;
                    }
                    return c.values()[((Long) objF3).intValue()];
                case -124:
                    return e.a((ArrayList) f(byteBuffer));
                case -123:
                    return g.a((ArrayList) f(byteBuffer));
                case -122:
                    return h.a((ArrayList) f(byteBuffer));
                case -121:
                    return n.a((ArrayList) f(byteBuffer));
                case -120:
                    return l.a((ArrayList) f(byteBuffer));
                case -119:
                    return a.a((ArrayList) f(byteBuffer));
                case -118:
                    return b.a((ArrayList) f(byteBuffer));
                default:
                    return super.g(b10, byteBuffer);
            }
        }

        @Override // sc.p
        protected void p(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
            ArrayList<Object> arrayListE;
            int i10;
            Integer numValueOf = null;
            if (obj instanceof k) {
                byteArrayOutputStream.write(129);
                if (obj != null) {
                    i10 = ((k) obj).f6900a;
                    numValueOf = Integer.valueOf(i10);
                }
            } else if (obj instanceof m) {
                byteArrayOutputStream.write(130);
                if (obj != null) {
                    i10 = ((m) obj).f6906a;
                    numValueOf = Integer.valueOf(i10);
                }
            } else {
                if (!(obj instanceof c)) {
                    if (obj instanceof e) {
                        byteArrayOutputStream.write(132);
                        arrayListE = ((e) obj).h();
                    } else if (obj instanceof g) {
                        byteArrayOutputStream.write(133);
                        arrayListE = ((g) obj).h();
                    } else if (obj instanceof h) {
                        byteArrayOutputStream.write(134);
                        arrayListE = ((h) obj).d();
                    } else if (obj instanceof n) {
                        byteArrayOutputStream.write(135);
                        arrayListE = ((n) obj).d();
                    } else if (obj instanceof l) {
                        byteArrayOutputStream.write(136);
                        arrayListE = ((l) obj).f();
                    } else if (obj instanceof a) {
                        byteArrayOutputStream.write(137);
                        arrayListE = ((a) obj).d();
                    } else if (!(obj instanceof b)) {
                        super.p(byteArrayOutputStream, obj);
                        return;
                    } else {
                        byteArrayOutputStream.write(138);
                        arrayListE = ((b) obj).e();
                    }
                    p(byteArrayOutputStream, arrayListE);
                    return;
                }
                byteArrayOutputStream.write(131);
                if (obj != null) {
                    i10 = ((c) obj).f6880a;
                    numValueOf = Integer.valueOf(i10);
                }
            }
            p(byteArrayOutputStream, numValueOf);
        }
    }

    public interface j<T> {
        void a(Throwable th);

        void success(T t10);
    }

    public enum k {
        REAR(0),
        FRONT(1);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final int f6900a;

        k(int i10) {
            this.f6900a = i10;
        }
    }

    public static final class l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private m f6901a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private k f6902b;

        l() {
        }

        static l a(ArrayList<Object> arrayList) {
            l lVar = new l();
            lVar.e((m) arrayList.get(0));
            lVar.d((k) arrayList.get(1));
            return lVar;
        }

        public k b() {
            return this.f6902b;
        }

        public m c() {
            return this.f6901a;
        }

        public void d(k kVar) {
            this.f6902b = kVar;
        }

        public void e(m mVar) {
            if (mVar == null) {
                throw new IllegalStateException("Nonnull field \"type\" is null.");
            }
            this.f6901a = mVar;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || l.class != obj.getClass()) {
                return false;
            }
            l lVar = (l) obj;
            return this.f6901a.equals(lVar.f6901a) && Objects.equals(this.f6902b, lVar.f6902b);
        }

        ArrayList<Object> f() {
            ArrayList<Object> arrayList = new ArrayList<>(2);
            arrayList.add(this.f6901a);
            arrayList.add(this.f6902b);
            return arrayList;
        }

        public int hashCode() {
            return Objects.hash(this.f6901a, this.f6902b);
        }
    }

    public enum m {
        CAMERA(0),
        GALLERY(1);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final int f6906a;

        m(int i10) {
            this.f6906a = i10;
        }
    }

    public static final class n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Long f6907a;

        static n a(ArrayList<Object> arrayList) {
            n nVar = new n();
            nVar.c((Long) arrayList.get(0));
            return nVar;
        }

        public Long b() {
            return this.f6907a;
        }

        public void c(Long l10) {
            this.f6907a = l10;
        }

        ArrayList<Object> d() {
            ArrayList<Object> arrayList = new ArrayList<>(1);
            arrayList.add(this.f6907a);
            return arrayList;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || n.class != obj.getClass()) {
                return false;
            }
            return Objects.equals(this.f6907a, ((n) obj).f6907a);
        }

        public int hashCode() {
            return Objects.hash(this.f6907a);
        }
    }

    protected static ArrayList<Object> a(Throwable th) {
        Object obj;
        ArrayList<Object> arrayList = new ArrayList<>(3);
        if (th instanceof d) {
            d dVar = (d) th;
            arrayList.add(dVar.f6881a);
            arrayList.add(dVar.getMessage());
            obj = dVar.f6882b;
        } else {
            arrayList.add(th.toString());
            arrayList.add(th.getClass().getSimpleName());
            obj = "Cause: " + th.getCause() + ", Stacktrace: " + Log.getStackTraceString(th);
        }
        arrayList.add(obj);
        return arrayList;
    }
}
