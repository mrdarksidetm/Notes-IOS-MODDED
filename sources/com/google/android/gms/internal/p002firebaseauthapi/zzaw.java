package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Arrays;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
final class zzaw<K, V> extends zzap<K, V> {
    private static final zzap<Object, Object> zza = new zzaw(null, new Object[0], 0);
    private final transient Object zzb;
    private final transient Object[] zzc;
    private final transient int zzd;

    private zzaw(Object obj, Object[] objArr, int i10) {
        this.zzb = obj;
        this.zzc = objArr;
        this.zzd = i10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v18, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v27 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r5v2, types: [int[]] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.Object[]] */
    static <K, V> zzaw<K, V> zza(int i10, Object[] objArr, zzas<K, V> zzasVar) {
        short[] sArr;
        char c10;
        char c11;
        ?? r32;
        ?? r33;
        int i11 = i10;
        Object[] objArrCopyOf = objArr;
        if (i11 == 0) {
            return (zzaw) zza;
        }
        zzar zzarVar = null;
        ?? r34 = 0;
        zzar zzarVar2 = null;
        zzar zzarVar3 = null;
        int i12 = 1;
        if (i11 == 1) {
            Object obj = objArrCopyOf[0];
            Objects.requireNonNull(obj);
            Object obj2 = objArrCopyOf[1];
            Objects.requireNonNull(obj2);
            zzai.zza(obj, obj2);
            return new zzaw<>(null, objArrCopyOf, 1);
        }
        zzy.zzb(i11, objArrCopyOf.length >> 1);
        int iMax = Math.max(i11, 2);
        int iHighestOneBit = 1073741824;
        if (iMax < 751619276) {
            iHighestOneBit = Integer.highestOneBit(iMax - 1) << 1;
            while (((double) iHighestOneBit) * 0.7d < iMax) {
                iHighestOneBit <<= 1;
            }
        } else if (!(iMax < 1073741824)) {
            throw new IllegalArgumentException("collection too large");
        }
        if (i11 == 1) {
            Object obj3 = objArrCopyOf[0];
            Objects.requireNonNull(obj3);
            Object obj4 = objArrCopyOf[1];
            Objects.requireNonNull(obj4);
            zzai.zza(obj3, obj4);
            c10 = 1;
            c11 = 2;
        } else {
            int i13 = iHighestOneBit - 1;
            byte b10 = -1;
            if (iHighestOneBit <= 128) {
                byte[] bArr = new byte[iHighestOneBit];
                Arrays.fill(bArr, (byte) -1);
                int i14 = 0;
                int i15 = 0;
                while (i14 < i11) {
                    int i16 = i14 * 2;
                    int i17 = i15 * 2;
                    Object obj5 = objArrCopyOf[i16];
                    Objects.requireNonNull(obj5);
                    Object obj6 = objArrCopyOf[i16 ^ i12];
                    Objects.requireNonNull(obj6);
                    zzai.zza(obj5, obj6);
                    int iZza = zzah.zza(obj5.hashCode());
                    while (true) {
                        int i18 = iZza & i13;
                        int i19 = bArr[i18] & 255;
                        if (i19 == 255) {
                            bArr[i18] = (byte) i17;
                            if (i15 < i14) {
                                objArrCopyOf[i17] = obj5;
                                objArrCopyOf[i17 ^ 1] = obj6;
                            }
                            i15++;
                        } else {
                            if (obj5.equals(objArrCopyOf[i19 == true ? 1 : 0])) {
                                int i20 = ~i19;
                                Object obj7 = objArrCopyOf[i20 == true ? 1 : 0];
                                Objects.requireNonNull(obj7);
                                zzarVar2 = new zzar(obj5, obj6, obj7);
                                objArrCopyOf[i20 == true ? 1 : 0] = obj6;
                                break;
                            }
                            iZza = i18 + 1;
                        }
                    }
                    i14++;
                    i12 = 1;
                }
                if (i15 == i11) {
                    r32 = bArr;
                    c11 = 2;
                    r33 = r32;
                    c10 = 1;
                    r34 = r33;
                } else {
                    r33 = new Object[]{bArr, Integer.valueOf(i15), zzarVar2};
                    c11 = 2;
                    c10 = 1;
                    r34 = r33;
                }
            } else {
                if (iHighestOneBit <= 32768) {
                    sArr = new short[iHighestOneBit];
                    Arrays.fill(sArr, (short) -1);
                    int i21 = 0;
                    for (int i22 = 0; i22 < i11; i22++) {
                        int i23 = i22 * 2;
                        int i24 = i21 * 2;
                        Object obj8 = objArrCopyOf[i23];
                        Objects.requireNonNull(obj8);
                        Object obj9 = objArrCopyOf[i23 ^ 1];
                        Objects.requireNonNull(obj9);
                        zzai.zza(obj8, obj9);
                        int iZza2 = zzah.zza(obj8.hashCode());
                        while (true) {
                            int i25 = iZza2 & i13;
                            int i26 = sArr[i25] & 65535;
                            if (i26 == 65535) {
                                sArr[i25] = (short) i24;
                                if (i21 < i22) {
                                    objArrCopyOf[i24] = obj8;
                                    objArrCopyOf[i24 ^ 1] = obj9;
                                }
                                i21++;
                            } else {
                                if (obj8.equals(objArrCopyOf[i26 == true ? 1 : 0])) {
                                    int i27 = ~i26;
                                    Object obj10 = objArrCopyOf[i27 == true ? 1 : 0];
                                    Objects.requireNonNull(obj10);
                                    zzarVar3 = new zzar(obj8, obj9, obj10);
                                    objArrCopyOf[i27 == true ? 1 : 0] = obj9;
                                    break;
                                }
                                iZza2 = i25 + 1;
                            }
                        }
                    }
                    if (i21 != i11) {
                        c11 = 2;
                        r33 = new Object[]{sArr, Integer.valueOf(i21), zzarVar3};
                        c10 = 1;
                        r34 = r33;
                    }
                } else {
                    sArr = new int[iHighestOneBit];
                    Arrays.fill((int[]) sArr, -1);
                    int i28 = 0;
                    int i29 = 0;
                    while (i28 < i11) {
                        int i30 = i28 * 2;
                        int i31 = i29 * 2;
                        Object obj11 = objArrCopyOf[i30];
                        Objects.requireNonNull(obj11);
                        Object obj12 = objArrCopyOf[i30 ^ 1];
                        Objects.requireNonNull(obj12);
                        zzai.zza(obj11, obj12);
                        int iZza3 = zzah.zza(obj11.hashCode());
                        while (true) {
                            int i32 = iZza3 & i13;
                            ?? r15 = sArr[i32];
                            if (r15 == b10) {
                                sArr[i32] = i31;
                                if (i29 < i28) {
                                    objArrCopyOf[i31] = obj11;
                                    objArrCopyOf[i31 ^ 1] = obj12;
                                }
                                i29++;
                            } else {
                                if (obj11.equals(objArrCopyOf[r15])) {
                                    int i33 = r15 ^ 1;
                                    Object obj13 = objArrCopyOf[i33 == true ? 1 : 0];
                                    Objects.requireNonNull(obj13);
                                    zzarVar = new zzar(obj11, obj12, obj13);
                                    objArrCopyOf[i33 == true ? 1 : 0] = obj12;
                                    break;
                                }
                                iZza3 = i32 + 1;
                                b10 = -1;
                            }
                        }
                        i28++;
                        b10 = -1;
                    }
                    if (i29 != i11) {
                        c10 = 1;
                        c11 = 2;
                        r34 = new Object[]{sArr, Integer.valueOf(i29), zzarVar};
                    }
                }
                r32 = sArr;
                c11 = 2;
                r33 = r32;
                c10 = 1;
                r34 = r33;
            }
        }
        boolean z10 = r34 instanceof Object[];
        ?? r35 = r34;
        if (z10) {
            Object[] objArr2 = (Object[]) r34;
            zzar zzarVar4 = (zzar) objArr2[c11];
            if (zzasVar == null) {
                throw zzarVar4.zza();
            }
            zzasVar.zza = zzarVar4;
            Object obj14 = objArr2[0];
            int iIntValue = ((Integer) objArr2[c10]).intValue();
            objArrCopyOf = Arrays.copyOf(objArrCopyOf, iIntValue << 1);
            r35 = obj14;
            i11 = iIntValue;
        }
        return new zzaw<>(r35, objArrCopyOf, i11);
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x0009 A[EDGE_INSN: B:43:0x0009->B:4:0x0009 BREAK  A[LOOP:0: B:15:0x0037->B:21:0x004d], EDGE_INSN: B:45:0x0009->B:4:0x0009 BREAK  A[LOOP:1: B:25:0x0062->B:31:0x0079], EDGE_INSN: B:47:0x0009->B:4:0x0009 BREAK  A[LOOP:2: B:33:0x0088->B:42:0x00a0]] */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final V get(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.Object r0 = r8.zzb
            java.lang.Object[] r1 = r8.zzc
            int r2 = r8.zzd
            r3 = 0
            if (r9 != 0) goto Lc
        L9:
            r9 = r3
            goto L9c
        Lc:
            r4 = 1
            if (r2 != r4) goto L22
            r0 = 0
            r0 = r1[r0]
            java.util.Objects.requireNonNull(r0)
            boolean r9 = r0.equals(r9)
            if (r9 == 0) goto L9
            r9 = r1[r4]
            java.util.Objects.requireNonNull(r9)
            goto L9c
        L22:
            if (r0 != 0) goto L25
            goto L9
        L25:
            boolean r2 = r0 instanceof byte[]
            if (r2 == 0) goto L50
            r2 = r0
            byte[] r2 = (byte[]) r2
            int r0 = r2.length
            int r5 = r0 + (-1)
            int r0 = r9.hashCode()
            int r0 = com.google.android.gms.internal.p002firebaseauthapi.zzah.zza(r0)
        L37:
            r0 = r0 & r5
            r6 = r2[r0]
            r7 = 255(0xff, float:3.57E-43)
            r6 = r6 & r7
            if (r6 != r7) goto L40
            goto L9
        L40:
            r7 = r1[r6]
            boolean r7 = r9.equals(r7)
            if (r7 == 0) goto L4d
            r9 = r6 ^ 1
            r9 = r1[r9]
            goto L9c
        L4d:
            int r0 = r0 + 1
            goto L37
        L50:
            boolean r2 = r0 instanceof short[]
            if (r2 == 0) goto L7c
            r2 = r0
            short[] r2 = (short[]) r2
            int r0 = r2.length
            int r5 = r0 + (-1)
            int r0 = r9.hashCode()
            int r0 = com.google.android.gms.internal.p002firebaseauthapi.zzah.zza(r0)
        L62:
            r0 = r0 & r5
            short r6 = r2[r0]
            r7 = 65535(0xffff, float:9.1834E-41)
            r6 = r6 & r7
            if (r6 != r7) goto L6c
            goto L9
        L6c:
            r7 = r1[r6]
            boolean r7 = r9.equals(r7)
            if (r7 == 0) goto L79
            r9 = r6 ^ 1
            r9 = r1[r9]
            goto L9c
        L79:
            int r0 = r0 + 1
            goto L62
        L7c:
            int[] r0 = (int[]) r0
            int r2 = r0.length
            int r2 = r2 - r4
            int r5 = r9.hashCode()
            int r5 = com.google.android.gms.internal.p002firebaseauthapi.zzah.zza(r5)
        L88:
            r5 = r5 & r2
            r6 = r0[r5]
            r7 = -1
            if (r6 != r7) goto L90
            goto L9
        L90:
            r7 = r1[r6]
            boolean r7 = r9.equals(r7)
            if (r7 == 0) goto La0
            r9 = r6 ^ 1
            r9 = r1[r9]
        L9c:
            if (r9 != 0) goto L9f
            return r3
        L9f:
            return r9
        La0:
            int r5 = r5 + 1
            goto L88
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p002firebaseauthapi.zzaw.get(java.lang.Object):java.lang.Object");
    }

    @Override // java.util.Map
    public final int size() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzap
    final zzak<V> zza() {
        return new zzba(this.zzc, 1, this.zzd);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzap
    final zzau<Map.Entry<K, V>> zzb() {
        return new zzav(this, this.zzc, 0, this.zzd);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzap
    final zzau<K> zzc() {
        return new zzax(this, new zzba(this.zzc, 0, this.zzd));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzap
    final boolean zzd() {
        return false;
    }
}
