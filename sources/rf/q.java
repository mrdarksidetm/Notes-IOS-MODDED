package rf;

/* JADX INFO: loaded from: classes2.dex */
public class q extends wf.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final uf.q f19562a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f19563b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f19564c;

    public static class a extends wf.b {
        @Override // wf.e
        public wf.f a(wf.h hVar, wf.g gVar) {
            b bVarO;
            wf.f fVarD;
            wf.d dVarA = gVar.a();
            if (hVar.c() < tf.f.f21413a && (bVarO = q.o(hVar.d().a(), hVar.e(), hVar.a() + hVar.c(), !gVar.b().f())) != null) {
                int i10 = bVarO.f19566b;
                r rVar = new r(i10 - hVar.a());
                if ((dVarA instanceof q) && q.n((uf.q) dVarA.g(), bVarO.f19565a)) {
                    fVarD = wf.f.d(rVar);
                } else {
                    q qVar = new q(bVarO.f19565a);
                    bVarO.f19565a.o(true);
                    fVarD = wf.f.d(qVar, rVar);
                }
                return fVarD.a(i10);
            }
            return wf.f.c();
        }
    }

    private static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final uf.q f19565a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f19566b;

        b(uf.q qVar, int i10) {
            this.f19565a = qVar;
            this.f19566b = i10;
        }
    }

    private static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final uf.q f19567a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f19568b;

        c(uf.q qVar, int i10) {
            this.f19567a = qVar;
            this.f19568b = i10;
        }
    }

    public q(uf.q qVar) {
        this.f19562a = qVar;
    }

    private static boolean l(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    private static boolean m(CharSequence charSequence, int i10) {
        char cCharAt;
        return i10 >= charSequence.length() || (cCharAt = charSequence.charAt(i10)) == '\t' || cCharAt == ' ';
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean n(uf.q qVar, uf.q qVar2) {
        Character chValueOf;
        char cP;
        if ((qVar instanceof uf.c) && (qVar2 instanceof uf.c)) {
            chValueOf = Character.valueOf(((uf.c) qVar).p());
            cP = ((uf.c) qVar2).p();
        } else {
            if (!(qVar instanceof uf.u) || !(qVar2 instanceof uf.u)) {
                return false;
            }
            chValueOf = Character.valueOf(((uf.u) qVar).p());
            cP = ((uf.u) qVar2).p();
        }
        return l(chValueOf, Character.valueOf(cP));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static b o(CharSequence charSequence, int i10, int i11, boolean z10) {
        c cVarP = p(charSequence, i10);
        if (cVarP == null) {
            return null;
        }
        uf.q qVar = cVarP.f19567a;
        int i12 = cVarP.f19568b;
        int i13 = i11 + (i12 - i10);
        boolean z11 = false;
        int length = charSequence.length();
        int iA = i13;
        while (true) {
            if (i12 >= length) {
                break;
            }
            char cCharAt = charSequence.charAt(i12);
            if (cCharAt != '\t') {
                if (cCharAt != ' ') {
                    z11 = true;
                    break;
                }
                iA++;
            } else {
                iA += tf.f.a(iA);
            }
            i12++;
        }
        if (z10 && (((qVar instanceof uf.u) && ((uf.u) qVar).q() != 1) || !z11)) {
            return null;
        }
        if (!z11 || iA - i13 > tf.f.f21413a) {
            iA = i13 + 1;
        }
        return new b(qVar, iA);
    }

    private static c p(CharSequence charSequence, int i10) {
        char cCharAt = charSequence.charAt(i10);
        if (cCharAt != '*' && cCharAt != '+' && cCharAt != '-') {
            return q(charSequence, i10);
        }
        int i11 = i10 + 1;
        if (!m(charSequence, i11)) {
            return null;
        }
        uf.c cVar = new uf.c();
        cVar.q(cCharAt);
        return new c(cVar, i11);
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x0009  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static rf.q.c q(java.lang.CharSequence r6, int r7) {
        /*
            int r0 = r6.length()
            r1 = 0
            r2 = r7
        L6:
            r3 = 0
            if (r2 >= r0) goto L4b
            char r4 = r6.charAt(r2)
            r5 = 41
            if (r4 == r5) goto L23
            r5 = 46
            if (r4 == r5) goto L23
            switch(r4) {
                case 48: goto L19;
                case 49: goto L19;
                case 50: goto L19;
                case 51: goto L19;
                case 52: goto L19;
                case 53: goto L19;
                case 54: goto L19;
                case 55: goto L19;
                case 56: goto L19;
                case 57: goto L19;
                default: goto L18;
            }
        L18:
            return r3
        L19:
            int r1 = r1 + 1
            r4 = 9
            if (r1 <= r4) goto L20
            return r3
        L20:
            int r2 = r2 + 1
            goto L6
        L23:
            r0 = 1
            if (r1 < r0) goto L4b
            int r0 = r2 + 1
            boolean r1 = m(r6, r0)
            if (r1 == 0) goto L4b
            java.lang.CharSequence r6 = r6.subSequence(r7, r2)
            java.lang.String r6 = r6.toString()
            uf.u r7 = new uf.u
            r7.<init>()
            int r6 = java.lang.Integer.parseInt(r6)
            r7.s(r6)
            r7.r(r4)
            rf.q$c r6 = new rf.q$c
            r6.<init>(r7, r0)
            return r6
        L4b:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: rf.q.q(java.lang.CharSequence, int):rf.q$c");
    }

    @Override // wf.a, wf.d
    public boolean a() {
        return true;
    }

    @Override // wf.d
    public wf.c e(wf.h hVar) {
        int i10;
        if (!hVar.b()) {
            i10 = this.f19563b ? this.f19564c + 1 : 0;
            return wf.c.b(hVar.getIndex());
        }
        this.f19563b = true;
        this.f19564c = i10;
        return wf.c.b(hVar.getIndex());
    }

    @Override // wf.d
    public uf.a g() {
        return this.f19562a;
    }

    @Override // wf.a, wf.d
    public boolean h(uf.a aVar) {
        if (!(aVar instanceof uf.r)) {
            return false;
        }
        if (this.f19563b && this.f19564c == 1) {
            this.f19562a.o(false);
            this.f19563b = false;
        }
        return true;
    }
}
