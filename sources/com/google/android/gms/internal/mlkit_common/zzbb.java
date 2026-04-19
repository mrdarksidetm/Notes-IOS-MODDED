package com.google.android.gms.internal.mlkit_common;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
final class zzbb extends zzat {
    static final zzat zza = new zzbb(null, new Object[0], 0);
    final transient Object[] zzb;
    private final transient Object zzc;
    private final transient int zzd;

    private zzbb(Object obj, Object[] objArr, int i10) {
        this.zzc = obj;
        this.zzb = objArr;
        this.zzd = i10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v21, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v27 */
    /* JADX WARN: Type inference failed for: r3v34 */
    /* JADX WARN: Type inference failed for: r3v35 */
    /* JADX WARN: Type inference failed for: r3v36 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r5v2, types: [int[]] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.Object[]] */
    static zzbb zzg(int i10, Object[] objArr, zzas zzasVar) {
        short[] sArr;
        char c10;
        char c11;
        ?? r32;
        ?? r33;
        int i11 = i10;
        Object[] objArrCopyOf = objArr;
        if (i11 == 0) {
            return (zzbb) zza;
        }
        zzar zzarVar = null;
        ?? r34 = 0;
        zzar zzarVar2 = null;
        zzar zzarVar3 = null;
        int i12 = 1;
        if (i11 == 1) {
            Object obj = objArrCopyOf[0];
            obj.getClass();
            Object obj2 = objArrCopyOf[1];
            obj2.getClass();
            zzah.zza(obj, obj2);
            return new zzbb(null, objArrCopyOf, 1);
        }
        zzae.zzb(i11, objArrCopyOf.length >> 1, "index");
        int iMax = Math.max(i11, 2);
        int i13 = 1073741824;
        if (iMax < 751619276) {
            int iHighestOneBit = Integer.highestOneBit(iMax - 1);
            i13 = iHighestOneBit + iHighestOneBit;
            while (((double) i13) * 0.7d < iMax) {
                i13 += i13;
            }
        } else if (iMax >= 1073741824) {
            throw new IllegalArgumentException("collection too large");
        }
        if (i11 == 1) {
            Object obj3 = objArrCopyOf[0];
            obj3.getClass();
            Object obj4 = objArrCopyOf[1];
            obj4.getClass();
            zzah.zza(obj3, obj4);
            i11 = 1;
            c10 = 1;
            c11 = 2;
        } else {
            int i14 = i13 - 1;
            byte b10 = -1;
            if (i13 <= 128) {
                byte[] bArr = new byte[i13];
                Arrays.fill(bArr, (byte) -1);
                int i15 = 0;
                int i16 = 0;
                while (i15 < i11) {
                    int i17 = i16 + i16;
                    int i18 = i15 + i15;
                    Object obj5 = objArrCopyOf[i18];
                    obj5.getClass();
                    Object obj6 = objArrCopyOf[i18 ^ i12];
                    obj6.getClass();
                    zzah.zza(obj5, obj6);
                    int iZza = zzaj.zza(obj5.hashCode());
                    while (true) {
                        int i19 = iZza & i14;
                        int i20 = bArr[i19] & 255;
                        if (i20 == 255) {
                            bArr[i19] = (byte) i17;
                            if (i16 < i15) {
                                objArrCopyOf[i17] = obj5;
                                objArrCopyOf[i17 ^ 1] = obj6;
                            }
                            i16++;
                        } else {
                            if (obj5.equals(objArrCopyOf[i20 == true ? 1 : 0])) {
                                int i21 = ~i20;
                                Object obj7 = objArrCopyOf[i21 == true ? 1 : 0];
                                obj7.getClass();
                                zzar zzarVar4 = new zzar(obj5, obj6, obj7);
                                objArrCopyOf[i21 == true ? 1 : 0] = obj6;
                                zzarVar2 = zzarVar4;
                                break;
                            }
                            iZza = i19 + 1;
                        }
                    }
                    i15++;
                    i12 = 1;
                }
                if (i16 == i11) {
                    r32 = bArr;
                } else {
                    r33 = new Object[]{bArr, Integer.valueOf(i16), zzarVar2};
                    c11 = 2;
                    c10 = 1;
                    r34 = r33;
                }
            } else if (i13 <= 32768) {
                sArr = new short[i13];
                Arrays.fill(sArr, (short) -1);
                int i22 = 0;
                for (int i23 = 0; i23 < i11; i23++) {
                    int i24 = i22 + i22;
                    int i25 = i23 + i23;
                    Object obj8 = objArrCopyOf[i25];
                    obj8.getClass();
                    Object obj9 = objArrCopyOf[i25 ^ 1];
                    obj9.getClass();
                    zzah.zza(obj8, obj9);
                    int iZza2 = zzaj.zza(obj8.hashCode());
                    while (true) {
                        int i26 = iZza2 & i14;
                        char c12 = (char) sArr[i26];
                        if (c12 == 65535) {
                            sArr[i26] = (short) i24;
                            if (i22 < i23) {
                                objArrCopyOf[i24] = obj8;
                                objArrCopyOf[i24 ^ 1] = obj9;
                            }
                            i22++;
                        } else {
                            if (obj8.equals(objArrCopyOf[c12])) {
                                int i27 = c12 ^ 1;
                                Object obj10 = objArrCopyOf[i27 == true ? 1 : 0];
                                obj10.getClass();
                                zzar zzarVar5 = new zzar(obj8, obj9, obj10);
                                objArrCopyOf[i27 == true ? 1 : 0] = obj9;
                                zzarVar3 = zzarVar5;
                                break;
                            }
                            iZza2 = i26 + 1;
                        }
                    }
                }
                if (i22 != i11) {
                    c11 = 2;
                    r34 = new Object[]{sArr, Integer.valueOf(i22), zzarVar3};
                    c10 = 1;
                }
                r32 = sArr;
            } else {
                int i28 = 1;
                sArr = new int[i13];
                Arrays.fill((int[]) sArr, -1);
                int i29 = 0;
                int i30 = 0;
                while (i29 < i11) {
                    int i31 = i30 + i30;
                    int i32 = i29 + i29;
                    Object obj11 = objArrCopyOf[i32];
                    obj11.getClass();
                    Object obj12 = objArrCopyOf[i32 ^ i28];
                    obj12.getClass();
                    zzah.zza(obj11, obj12);
                    int iZza3 = zzaj.zza(obj11.hashCode());
                    while (true) {
                        int i33 = iZza3 & i14;
                        ?? r15 = sArr[i33];
                        if (r15 == b10) {
                            sArr[i33] = i31;
                            if (i30 < i29) {
                                objArrCopyOf[i31] = obj11;
                                objArrCopyOf[i31 ^ 1] = obj12;
                            }
                            i30++;
                        } else {
                            if (obj11.equals(objArrCopyOf[r15])) {
                                int i34 = r15 ^ 1;
                                Object obj13 = objArrCopyOf[i34 == true ? 1 : 0];
                                obj13.getClass();
                                zzar zzarVar6 = new zzar(obj11, obj12, obj13);
                                objArrCopyOf[i34 == true ? 1 : 0] = obj12;
                                zzarVar = zzarVar6;
                                break;
                            }
                            iZza3 = i33 + 1;
                            b10 = -1;
                        }
                    }
                    i29++;
                    i28 = 1;
                    b10 = -1;
                }
                if (i30 != i11) {
                    c10 = 1;
                    c11 = 2;
                    r34 = new Object[]{sArr, Integer.valueOf(i30), zzarVar};
                }
                r32 = sArr;
            }
            c11 = 2;
            r33 = r32;
            c10 = 1;
            r34 = r33;
        }
        boolean z10 = r34 instanceof Object[];
        ?? r35 = r34;
        if (z10) {
            Object[] objArr2 = (Object[]) r34;
            zzar zzarVar7 = (zzar) objArr2[c11];
            if (zzasVar == null) {
                throw zzarVar7.zza();
            }
            zzasVar.zzc = zzarVar7;
            Object obj14 = objArr2[0];
            int iIntValue = ((Integer) objArr2[c10]).intValue();
            objArrCopyOf = Arrays.copyOf(objArrCopyOf, iIntValue + iIntValue);
            r35 = obj14;
            i11 = iIntValue;
        }
        return new zzbb(r35, objArrCopyOf, i11);
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x0003  */
    /* JADX WARN: Removed duplicated region for block: B:4:0x0003 A[EDGE_INSN: B:44:0x0003->B:4:0x0003 BREAK  A[LOOP:0: B:16:0x0038->B:22:0x004e], EDGE_INSN: B:46:0x0003->B:4:0x0003 BREAK  A[LOOP:1: B:26:0x0063->B:32:0x007a], EDGE_INSN: B:48:0x0003->B:4:0x0003 BREAK  A[LOOP:2: B:34:0x0089->B:43:0x00a0]] */
    @Override // com.google.android.gms.internal.mlkit_common.zzat, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object get(java.lang.Object r10) {
        /*
            r9 = this;
            r0 = 0
            if (r10 != 0) goto L6
        L3:
            r10 = r0
            goto L9c
        L6:
            int r1 = r9.zzd
            java.lang.Object[] r2 = r9.zzb
            r3 = 1
            if (r1 != r3) goto L20
            r1 = 0
            r1 = r2[r1]
            r1.getClass()
            boolean r10 = r1.equals(r10)
            if (r10 == 0) goto L3
            r10 = r2[r3]
            r10.getClass()
            goto L9c
        L20:
            java.lang.Object r1 = r9.zzc
            if (r1 != 0) goto L25
            goto L3
        L25:
            boolean r4 = r1 instanceof byte[]
            r5 = -1
            if (r4 == 0) goto L51
            r4 = r1
            byte[] r4 = (byte[]) r4
            int r1 = r4.length
            int r6 = r1 + (-1)
            int r1 = r10.hashCode()
            int r1 = com.google.android.gms.internal.mlkit_common.zzaj.zza(r1)
        L38:
            r1 = r1 & r6
            r5 = r4[r1]
            r7 = 255(0xff, float:3.57E-43)
            r5 = r5 & r7
            if (r5 != r7) goto L41
            goto L3
        L41:
            r7 = r2[r5]
            boolean r7 = r10.equals(r7)
            if (r7 == 0) goto L4e
            r10 = r5 ^ 1
            r10 = r2[r10]
            goto L9c
        L4e:
            int r1 = r1 + 1
            goto L38
        L51:
            boolean r4 = r1 instanceof short[]
            if (r4 == 0) goto L7d
            r4 = r1
            short[] r4 = (short[]) r4
            int r1 = r4.length
            int r6 = r1 + (-1)
            int r1 = r10.hashCode()
            int r1 = com.google.android.gms.internal.mlkit_common.zzaj.zza(r1)
        L63:
            r1 = r1 & r6
            short r5 = r4[r1]
            char r5 = (char) r5
            r7 = 65535(0xffff, float:9.1834E-41)
            if (r5 != r7) goto L6d
            goto L3
        L6d:
            r7 = r2[r5]
            boolean r7 = r10.equals(r7)
            if (r7 == 0) goto L7a
            r10 = r5 ^ 1
            r10 = r2[r10]
            goto L9c
        L7a:
            int r1 = r1 + 1
            goto L63
        L7d:
            int[] r1 = (int[]) r1
            int r4 = r1.length
            int r4 = r4 + r5
            int r6 = r10.hashCode()
            int r6 = com.google.android.gms.internal.mlkit_common.zzaj.zza(r6)
        L89:
            r6 = r6 & r4
            r7 = r1[r6]
            if (r7 != r5) goto L90
            goto L3
        L90:
            r8 = r2[r7]
            boolean r8 = r10.equals(r8)
            if (r8 == 0) goto La0
            r10 = r7 ^ 1
            r10 = r2[r10]
        L9c:
            if (r10 != 0) goto L9f
            return r0
        L9f:
            return r10
        La0:
            int r6 = r6 + 1
            goto L89
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_common.zzbb.get(java.lang.Object):java.lang.Object");
    }

    @Override // java.util.Map
    public final int size() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzat
    final zzam zza() {
        return new zzba(this.zzb, 1, this.zzd);
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzat
    final zzau zzd() {
        return new zzay(this, this.zzb, 0, this.zzd);
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzat
    final zzau zze() {
        return new zzaz(this, new zzba(this.zzb, 0, this.zzd));
    }
}
