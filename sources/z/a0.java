package z;

/* JADX INFO: loaded from: classes.dex */
public abstract class a0<E> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long[] f24050a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object[] f24051b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f24052c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f24053d;

    static final class a extends ae.s implements zd.l<E, CharSequence> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ a0<E> f24054a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(a0<E> a0Var) {
            super(1);
            this.f24054a = a0Var;
        }

        @Override // zd.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(E e10) {
            return e10 == this.f24054a ? "(this)" : String.valueOf(e10);
        }
    }

    private a0() {
        this.f24050a = z.f24117a;
        this.f24051b = a0.a.f16c;
    }

    public /* synthetic */ a0(ae.j jVar) {
        this();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ String f(a0 a0Var, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, zd.l lVar, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: joinToString");
        }
        if ((i11 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence5 = (i11 & 2) != 0 ? "" : charSequence2;
        CharSequence charSequence6 = (i11 & 4) == 0 ? charSequence3 : "";
        if ((i11 & 8) != 0) {
            i10 = -1;
        }
        int i12 = i10;
        if ((i11 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i11 & 32) != 0) {
            lVar = null;
        }
        return a0Var.e(charSequence, charSequence5, charSequence6, i12, charSequence7, lVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0073, code lost:
    
        if (((r7 & ((~r7) << 6)) & (-9187201950435737472L)) == 0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0075, code lost:
    
        r11 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean a(E r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = 0
            if (r1 == 0) goto Lc
            int r3 = r18.hashCode()
            goto Ld
        Lc:
            r3 = r2
        Ld:
            r4 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r3 = r3 * r4
            int r4 = r3 << 16
            r3 = r3 ^ r4
            r4 = r3 & 127(0x7f, float:1.78E-43)
            int r5 = r0.f24052c
            int r3 = r3 >>> 7
            r3 = r3 & r5
            r6 = r2
        L1c:
            long[] r7 = r0.f24050a
            int r8 = r3 >> 3
            r9 = r3 & 7
            int r9 = r9 << 3
            r10 = r7[r8]
            long r10 = r10 >>> r9
            r12 = 1
            int r8 = r8 + r12
            r13 = r7[r8]
            int r7 = 64 - r9
            long r7 = r13 << r7
            long r13 = (long) r9
            long r13 = -r13
            r9 = 63
            long r13 = r13 >> r9
            long r7 = r7 & r13
            long r7 = r7 | r10
            long r9 = (long) r4
            r13 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r9 = r9 * r13
            long r9 = r9 ^ r7
            long r13 = r9 - r13
            long r9 = ~r9
            long r9 = r9 & r13
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r9 = r9 & r13
        L48:
            r15 = 0
            int r11 = (r9 > r15 ? 1 : (r9 == r15 ? 0 : -1))
            if (r11 == 0) goto L50
            r11 = r12
            goto L51
        L50:
            r11 = r2
        L51:
            if (r11 == 0) goto L6c
            int r11 = java.lang.Long.numberOfTrailingZeros(r9)
            int r11 = r11 >> 3
            int r11 = r11 + r3
            r11 = r11 & r5
            java.lang.Object[] r15 = r0.f24051b
            r15 = r15[r11]
            boolean r15 = ae.r.b(r15, r1)
            if (r15 == 0) goto L66
            goto L76
        L66:
            r15 = 1
            long r15 = r9 - r15
            long r9 = r9 & r15
            goto L48
        L6c:
            long r9 = ~r7
            r11 = 6
            long r9 = r9 << r11
            long r7 = r7 & r9
            long r7 = r7 & r13
            int r7 = (r7 > r15 ? 1 : (r7 == r15 ? 0 : -1))
            if (r7 == 0) goto L7a
            r11 = -1
        L76:
            if (r11 < 0) goto L79
            r2 = r12
        L79:
            return r2
        L7a:
            int r6 = r6 + 8
            int r3 = r3 + r6
            r3 = r3 & r5
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: z.a0.a(java.lang.Object):boolean");
    }

    public final int b() {
        return this.f24052c;
    }

    public final int c() {
        return this.f24053d;
    }

    public final boolean d() {
        return this.f24053d == 0;
    }

    public final String e(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, zd.l<? super E, ? extends CharSequence> lVar) {
        ae.r.f(charSequence, "separator");
        ae.r.f(charSequence2, "prefix");
        ae.r.f(charSequence3, "postfix");
        ae.r.f(charSequence4, "truncated");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(charSequence2);
        Object[] objArr = this.f24051b;
        long[] jArr = this.f24050a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i11 = 0;
            int i12 = 0;
            loop0: while (true) {
                long j10 = jArr[i11];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i13 = 8;
                    int i14 = 8 - ((~(i11 - length)) >>> 31);
                    for (int i15 = 0; i15 < i14; i15++) {
                        if ((j10 & 255) < 128) {
                            Object obj = objArr[(i11 << 3) + i15];
                            if (i12 == i10) {
                                sb2.append(charSequence4);
                                break loop0;
                            }
                            if (i12 != 0) {
                                sb2.append(charSequence);
                            }
                            if (lVar == null) {
                                sb2.append(obj);
                            } else {
                                sb2.append(lVar.invoke(obj));
                            }
                            i12++;
                            i13 = 8;
                        }
                        j10 >>= i13;
                    }
                    if (i14 != i13) {
                        break;
                    }
                }
                if (i11 == length) {
                    break;
                }
                i11++;
            }
            sb2.append(charSequence3);
        } else {
            sb2.append(charSequence3);
        }
        String string = sb2.toString();
        ae.r.e(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean equals(java.lang.Object r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = 1
            if (r1 != r0) goto L8
            return r2
        L8:
            boolean r3 = r1 instanceof z.a0
            r4 = 0
            if (r3 != 0) goto Le
            return r4
        Le:
            z.a0 r1 = (z.a0) r1
            int r3 = r1.c()
            int r5 = r17.c()
            if (r3 == r5) goto L1b
            return r4
        L1b:
            java.lang.Object[] r3 = r0.f24051b
            long[] r5 = r0.f24050a
            int r6 = r5.length
            int r6 = r6 + (-2)
            if (r6 < 0) goto L66
            r7 = r4
        L25:
            r8 = r5[r7]
            long r10 = ~r8
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L61
            int r10 = r7 - r6
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = r4
        L3f:
            if (r12 >= r10) goto L5f
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.3E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L4c
            r13 = r2
            goto L4d
        L4c:
            r13 = r4
        L4d:
            if (r13 == 0) goto L5b
            int r13 = r7 << 3
            int r13 = r13 + r12
            r13 = r3[r13]
            boolean r13 = r1.a(r13)
            if (r13 != 0) goto L5b
            return r4
        L5b:
            long r8 = r8 >> r11
            int r12 = r12 + 1
            goto L3f
        L5f:
            if (r10 != r11) goto L66
        L61:
            if (r7 == r6) goto L66
            int r7 = r7 + 1
            goto L25
        L66:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: z.a0.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        Object[] objArr = this.f24051b;
        long[] jArr = this.f24050a;
        int length = jArr.length - 2;
        int i10 = 0;
        if (length >= 0) {
            int i11 = 0;
            int iHashCode = 0;
            while (true) {
                long j10 = jArr[i11];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i12 = 8 - ((~(i11 - length)) >>> 31);
                    for (int i13 = 0; i13 < i12; i13++) {
                        if ((255 & j10) < 128) {
                            Object obj = objArr[(i11 << 3) + i13];
                            iHashCode += obj != null ? obj.hashCode() : 0;
                        }
                        j10 >>= 8;
                    }
                    if (i12 != 8) {
                        return iHashCode;
                    }
                }
                if (i11 == length) {
                    i10 = iHashCode;
                    break;
                }
                i11++;
            }
        }
        return i10;
    }

    public String toString() {
        return f(this, null, "[", "]", 0, null, new a(this), 25, null);
    }
}
