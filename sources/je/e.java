package je;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes2.dex */
final class e implements ie.g<ge.i> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final CharSequence f14199a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f14200b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f14201c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final zd.p<CharSequence, Integer, md.s<Integer, Integer>> f14202d;

    public static final class a implements Iterator<ge.i>, be.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f14203a = -1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f14204b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f14205c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private ge.i f14206d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f14207e;

        a() {
            int iL = ge.o.l(e.this.f14200b, 0, e.this.f14199a.length());
            this.f14204b = iL;
            this.f14205c = iL;
        }

        /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private final void c() {
            /*
                r6 = this;
                int r0 = r6.f14205c
                r1 = 0
                if (r0 >= 0) goto Lc
                r6.f14203a = r1
                r0 = 0
                r6.f14206d = r0
                goto L99
            Lc:
                je.e r0 = je.e.this
                int r0 = je.e.e(r0)
                r2 = -1
                r3 = 1
                if (r0 <= 0) goto L23
                int r0 = r6.f14207e
                int r0 = r0 + r3
                r6.f14207e = r0
                je.e r4 = je.e.this
                int r4 = je.e.e(r4)
                if (r0 >= r4) goto L31
            L23:
                int r0 = r6.f14205c
                je.e r4 = je.e.this
                java.lang.CharSequence r4 = je.e.d(r4)
                int r4 = r4.length()
                if (r0 <= r4) goto L47
            L31:
                ge.i r0 = new ge.i
                int r1 = r6.f14204b
                je.e r4 = je.e.this
                java.lang.CharSequence r4 = je.e.d(r4)
                int r4 = je.m.S(r4)
                r0.<init>(r1, r4)
            L42:
                r6.f14206d = r0
            L44:
                r6.f14205c = r2
                goto L97
            L47:
                je.e r0 = je.e.this
                zd.p r0 = je.e.c(r0)
                je.e r4 = je.e.this
                java.lang.CharSequence r4 = je.e.d(r4)
                int r5 = r6.f14205c
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                java.lang.Object r0 = r0.invoke(r4, r5)
                md.s r0 = (md.s) r0
                if (r0 != 0) goto L73
                ge.i r0 = new ge.i
                int r1 = r6.f14204b
                je.e r4 = je.e.this
                java.lang.CharSequence r4 = je.e.d(r4)
                int r4 = je.m.S(r4)
                r0.<init>(r1, r4)
                goto L42
            L73:
                java.lang.Object r2 = r0.a()
                java.lang.Number r2 = (java.lang.Number) r2
                int r2 = r2.intValue()
                java.lang.Object r0 = r0.b()
                java.lang.Number r0 = (java.lang.Number) r0
                int r0 = r0.intValue()
                int r4 = r6.f14204b
                ge.i r4 = ge.m.t(r4, r2)
                r6.f14206d = r4
                int r2 = r2 + r0
                r6.f14204b = r2
                if (r0 != 0) goto L95
                r1 = r3
            L95:
                int r2 = r2 + r1
                goto L44
            L97:
                r6.f14203a = r3
            L99:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: je.e.a.c():void");
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public ge.i next() {
            if (this.f14203a == -1) {
                c();
            }
            if (this.f14203a == 0) {
                throw new NoSuchElementException();
            }
            ge.i iVar = this.f14206d;
            ae.r.d(iVar, "null cannot be cast to non-null type kotlin.ranges.IntRange");
            this.f14206d = null;
            this.f14203a = -1;
            return iVar;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f14203a == -1) {
                c();
            }
            return this.f14203a == 1;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public e(CharSequence charSequence, int i10, int i11, zd.p<? super CharSequence, ? super Integer, md.s<Integer, Integer>> pVar) {
        ae.r.f(charSequence, "input");
        ae.r.f(pVar, "getNextMatch");
        this.f14199a = charSequence;
        this.f14200b = i10;
        this.f14201c = i11;
        this.f14202d = pVar;
    }

    @Override // ie.g
    public Iterator<ge.i> iterator() {
        return new a();
    }
}
