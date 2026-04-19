package com.google.android.recaptcha.internal;

/* JADX INFO: loaded from: classes2.dex */
final class zznl {
    static {
        if (zzni.zzx() && zzni.zzy()) {
            int i10 = zzij.zza;
        }
    }

    static /* bridge */ /* synthetic */ int zza(byte[] bArr, int i10, int i11) {
        int i12 = i11 - i10;
        byte b10 = bArr[i10 - 1];
        if (i12 == 0) {
            if (b10 <= -12) {
                return b10;
            }
            return -1;
        }
        if (i12 == 1) {
            byte b11 = bArr[i10];
            if (b10 > -12 || b11 > -65) {
                return -1;
            }
            return (b11 << 8) ^ b10;
        }
        if (i12 != 2) {
            throw new AssertionError();
        }
        byte b12 = bArr[i10];
        byte b13 = bArr[i10 + 1];
        if (b10 > -12 || b12 > -65 || b13 > -65) {
            return -1;
        }
        return (b13 << 16) ^ ((b12 << 8) ^ b10);
    }

    static int zzb(String str, byte[] bArr, int i10, int i11) {
        int i12;
        int i13;
        int i14;
        char cCharAt;
        int length = str.length();
        int i15 = 0;
        while (true) {
            i12 = i10 + i11;
            if (i15 >= length || (i14 = i15 + i10) >= i12 || (cCharAt = str.charAt(i15)) >= 128) {
                break;
            }
            bArr[i14] = (byte) cCharAt;
            i15++;
        }
        if (i15 == length) {
            return i10 + length;
        }
        int i16 = i10 + i15;
        while (i15 < length) {
            char cCharAt2 = str.charAt(i15);
            if (cCharAt2 < 128 && i16 < i12) {
                bArr[i16] = (byte) cCharAt2;
                i16++;
            } else if (cCharAt2 < 2048 && i16 <= i12 - 2) {
                int i17 = i16 + 1;
                bArr[i16] = (byte) ((cCharAt2 >>> 6) | 960);
                bArr[i17] = (byte) ((cCharAt2 & '?') | 128);
                i16 = i17 + 1;
            } else {
                if ((cCharAt2 >= 55296 && cCharAt2 <= 57343) || i16 > i12 - 3) {
                    if (i16 > i12 - 4) {
                        if (cCharAt2 >= 55296 && cCharAt2 <= 57343 && ((i13 = i15 + 1) == str.length() || !Character.isSurrogatePair(cCharAt2, str.charAt(i13)))) {
                            throw new zznk(i15, length);
                        }
                        throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt2 + " at index " + i16);
                    }
                    int i18 = i15 + 1;
                    if (i18 != str.length()) {
                        char cCharAt3 = str.charAt(i18);
                        if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                            int i19 = i16 + 1;
                            int i20 = i19 + 1;
                            int i21 = i20 + 1;
                            int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                            bArr[i16] = (byte) ((codePoint >>> 18) | 240);
                            bArr[i19] = (byte) (((codePoint >>> 12) & 63) | 128);
                            bArr[i20] = (byte) (((codePoint >>> 6) & 63) | 128);
                            i16 = i21 + 1;
                            bArr[i21] = (byte) ((codePoint & 63) | 128);
                            i15 = i18;
                        } else {
                            i15 = i18;
                        }
                    }
                    throw new zznk(i15 - 1, length);
                }
                int i22 = i16 + 1;
                int i23 = i22 + 1;
                bArr[i16] = (byte) ((cCharAt2 >>> '\f') | 480);
                bArr[i22] = (byte) (((cCharAt2 >>> 6) & 63) | 128);
                bArr[i23] = (byte) ((cCharAt2 & '?') | 128);
                i16 = i23 + 1;
            }
            i15++;
        }
        return i16;
    }

    static int zzc(String str) {
        int length = str.length();
        int i10 = 0;
        int i11 = 0;
        while (i11 < length && str.charAt(i11) < 128) {
            i11++;
        }
        int i12 = length;
        while (true) {
            if (i11 >= length) {
                break;
            }
            char cCharAt = str.charAt(i11);
            if (cCharAt < 2048) {
                i12 += (127 - cCharAt) >>> 31;
                i11++;
            } else {
                int length2 = str.length();
                while (i11 < length2) {
                    char cCharAt2 = str.charAt(i11);
                    if (cCharAt2 < 2048) {
                        i10 += (127 - cCharAt2) >>> 31;
                    } else {
                        i10 += 2;
                        if (cCharAt2 >= 55296 && cCharAt2 <= 57343) {
                            if (Character.codePointAt(str, i11) < 65536) {
                                throw new zznk(i11, length2);
                            }
                            i11++;
                        }
                    }
                    i11++;
                }
                i12 += i10;
            }
        }
        if (i12 >= length) {
            return i12;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (((long) i12) + 4294967296L));
    }

    static String zzd(byte[] bArr, int i10, int i11) throws zzlc {
        int length = bArr.length;
        if ((((length - i10) - i11) | i10 | i11) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(length), Integer.valueOf(i10), Integer.valueOf(i11)));
        }
        int i12 = i10 + i11;
        char[] cArr = new char[i11];
        int i13 = 0;
        while (i10 < i12) {
            byte b10 = bArr[i10];
            if (!zznj.zzd(b10)) {
                break;
            }
            i10++;
            cArr[i13] = (char) b10;
            i13++;
        }
        while (i10 < i12) {
            int i14 = i10 + 1;
            byte b11 = bArr[i10];
            if (zznj.zzd(b11)) {
                int i15 = i13 + 1;
                cArr[i13] = (char) b11;
                i10 = i14;
                while (true) {
                    i13 = i15;
                    if (i10 < i12) {
                        byte b12 = bArr[i10];
                        if (zznj.zzd(b12)) {
                            i10++;
                            i15 = i13 + 1;
                            cArr[i13] = (char) b12;
                        }
                    }
                }
            } else if (b11 < -32) {
                if (i14 >= i12) {
                    throw zzlc.zzd();
                }
                zznj.zzc(b11, bArr[i14], cArr, i13);
                i13++;
                i10 = i14 + 1;
            } else if (b11 < -16) {
                if (i14 >= i12 - 1) {
                    throw zzlc.zzd();
                }
                int i16 = i14 + 1;
                zznj.zzb(b11, bArr[i14], bArr[i16], cArr, i13);
                i13++;
                i10 = i16 + 1;
            } else {
                if (i14 >= i12 - 2) {
                    throw zzlc.zzd();
                }
                int i17 = i14 + 1;
                byte b13 = bArr[i14];
                int i18 = i17 + 1;
                zznj.zza(b11, b13, bArr[i17], bArr[i18], cArr, i13);
                i13 += 2;
                i10 = i18 + 1;
            }
        }
        return new String(cArr, 0, i13);
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x0072 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0076 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static boolean zze(byte[] r5, int r6, int r7) {
        /*
        L0:
            if (r6 >= r7) goto L9
            r0 = r5[r6]
            if (r0 < 0) goto L9
            int r6 = r6 + 1
            goto L0
        L9:
            if (r6 < r7) goto Ld
            goto L76
        Ld:
            if (r6 >= r7) goto L76
            int r0 = r6 + 1
            r6 = r5[r6]
            if (r6 >= 0) goto L74
            r1 = -32
            r2 = -65
            if (r6 >= r1) goto L29
            if (r0 < r7) goto L1e
            goto L53
        L1e:
            r1 = -62
            if (r6 < r1) goto L72
            int r6 = r0 + 1
            r0 = r5[r0]
            if (r0 <= r2) goto Ld
            goto L72
        L29:
            r3 = -16
            if (r6 >= r3) goto L4b
            int r3 = r7 + (-1)
            if (r0 < r3) goto L32
            goto L4f
        L32:
            int r3 = r0 + 1
            r0 = r5[r0]
            if (r0 > r2) goto L72
            r4 = -96
            if (r6 != r1) goto L3e
            if (r0 < r4) goto L72
        L3e:
            r1 = -19
            if (r6 != r1) goto L44
            if (r0 >= r4) goto L72
        L44:
            int r6 = r3 + 1
            r0 = r5[r3]
            if (r0 <= r2) goto Ld
            goto L72
        L4b:
            int r1 = r7 + (-2)
            if (r0 < r1) goto L56
        L4f:
            int r6 = zza(r5, r0, r7)
        L53:
            if (r6 == 0) goto L76
            goto L72
        L56:
            int r1 = r0 + 1
            r0 = r5[r0]
            if (r0 > r2) goto L72
            int r6 = r6 << 28
            int r0 = r0 + 112
            int r6 = r6 + r0
            int r6 = r6 >> 30
            if (r6 != 0) goto L72
            int r6 = r1 + 1
            r0 = r5[r1]
            if (r0 > r2) goto L72
            int r0 = r6 + 1
            r6 = r5[r6]
            if (r6 > r2) goto L72
            goto L74
        L72:
            r5 = 0
            return r5
        L74:
            r6 = r0
            goto Ld
        L76:
            r5 = 1
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zznl.zze(byte[], int, int):boolean");
    }
}
