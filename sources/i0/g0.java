package i0;

import j0.d;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final j f12067a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ArrayList<a> f12068b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f12069c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f12070d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f12071e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f12072f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final List<Integer> f12073g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private List<i0.b> f12074h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f12075i;

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f12076a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f12077b;

        public a(int i10, int i11) {
            this.f12076a = i10;
            this.f12077b = i11;
        }

        public /* synthetic */ a(int i10, int i11, int i12, ae.j jVar) {
            this(i10, (i12 & 2) != 0 ? 0 : i11);
        }

        public final int a() {
            return this.f12076a;
        }

        public final int b() {
            return this.f12077b;
        }
    }

    private static final class b implements s {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f12078a = new b();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f12079b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f12080c;

        private b() {
        }

        public void a(int i10) {
            f12079b = i10;
        }

        public void b(int i10) {
            f12080c = i10;
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f12081a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final List<i0.b> f12082b;

        public c(int i10, List<i0.b> list) {
            this.f12081a = i10;
            this.f12082b = list;
        }

        public final int a() {
            return this.f12081a;
        }

        public final List<i0.b> b() {
            return this.f12082b;
        }
    }

    static final class d extends ae.s implements zd.l<a, Integer> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f12083a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(int i10) {
            super(1);
            this.f12083a = i10;
        }

        @Override // zd.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Integer invoke(a aVar) {
            return Integer.valueOf(aVar.a() - this.f12083a);
        }
    }

    public g0(j jVar) {
        this.f12067a = jVar;
        ArrayList<a> arrayList = new ArrayList<>();
        int i10 = 0;
        arrayList.add(new a(i10, i10, 2, null));
        this.f12068b = arrayList;
        this.f12072f = -1;
        this.f12073g = new ArrayList();
        this.f12074h = nd.u.m();
    }

    private final int a() {
        return ((int) Math.sqrt((((double) f()) * 1.0d) / ((double) this.f12075i))) + 1;
    }

    private final List<i0.b> b(int i10) {
        if (i10 == this.f12074h.size()) {
            return this.f12074h;
        }
        ArrayList arrayList = new ArrayList(i10);
        for (int i11 = 0; i11 < i10; i11++) {
            arrayList.add(i0.b.a(f0.a(1)));
        }
        this.f12074h = arrayList;
        return arrayList;
    }

    private final void g() {
        this.f12068b.clear();
        int i10 = 0;
        this.f12068b.add(new a(i10, i10, 2, null));
        this.f12069c = 0;
        this.f12070d = 0;
        this.f12071e = 0;
        this.f12072f = -1;
        this.f12073g.clear();
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x009b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final i0.g0.c c(int r11) {
        /*
            Method dump skipped, instruction units count: 359
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.g0.c(int):i0.g0$c");
    }

    public final int d(int i10) {
        int i11 = 0;
        if (f() <= 0) {
            return 0;
        }
        if (!(i10 < f())) {
            throw new IllegalArgumentException("ItemIndex > total count".toString());
        }
        if (!this.f12067a.g()) {
            return i10 / this.f12075i;
        }
        int iK = nd.u.k(this.f12068b, 0, 0, new d(i10), 3, null);
        int i12 = 2;
        if (iK < 0) {
            iK = (-iK) - 2;
        }
        int iA = a() * iK;
        int iA2 = this.f12068b.get(iK).a();
        if (!(iA2 <= i10)) {
            throw new IllegalArgumentException("currentItemIndex > itemIndex".toString());
        }
        int i13 = 0;
        while (iA2 < i10) {
            int i14 = iA2 + 1;
            int i15 = i(iA2, this.f12075i - i13);
            i13 += i15;
            int i16 = this.f12075i;
            if (i13 >= i16) {
                iA++;
                i13 = i13 == i16 ? 0 : i15;
            }
            if (iA % a() == 0 && iA / a() >= this.f12068b.size()) {
                this.f12068b.add(new a(i14 - (i13 > 0 ? 1 : 0), i11, i12, null));
            }
            iA2 = i14;
        }
        return i13 + i(i10, this.f12075i - i13) > this.f12075i ? iA + 1 : iA;
    }

    public final int e() {
        return this.f12075i;
    }

    public final int f() {
        return this.f12067a.d().a();
    }

    public final void h(int i10) {
        if (i10 != this.f12075i) {
            this.f12075i = i10;
            g();
        }
    }

    public final int i(int i10, int i11) {
        b bVar = b.f12078a;
        bVar.a(i11);
        bVar.b(this.f12075i);
        d.a<i> aVar = this.f12067a.d().get(i10);
        return i0.b.d(aVar.c().b().invoke(bVar, Integer.valueOf(i10 - aVar.b())).g());
    }
}
