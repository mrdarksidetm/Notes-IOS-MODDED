package com.google.android.gms.internal.fido;

/* JADX INFO: loaded from: classes.dex */
final class zzdg {
    static String zza(zzcz zzczVar) {
        String str;
        StringBuilder sb2 = new StringBuilder(zzczVar.zzd());
        for (int i10 = 0; i10 < zzczVar.zzd(); i10++) {
            int iZza = zzczVar.zza(i10);
            if (iZza == 34) {
                str = "\\\"";
            } else if (iZza == 39) {
                str = "\\'";
            } else if (iZza != 92) {
                switch (iZza) {
                    case 7:
                        str = "\\a";
                        break;
                    case 8:
                        str = "\\b";
                        break;
                    case 9:
                        str = "\\t";
                        break;
                    case 10:
                        str = "\\n";
                        break;
                    case 11:
                        str = "\\v";
                        break;
                    case 12:
                        str = "\\f";
                        break;
                    case 13:
                        str = "\\r";
                        break;
                    default:
                        if (iZza < 32 || iZza > 126) {
                            sb2.append('\\');
                            sb2.append((char) (((iZza >>> 6) & 3) + 48));
                            sb2.append((char) (((iZza >>> 3) & 7) + 48));
                            iZza = (iZza & 7) + 48;
                        }
                        sb2.append((char) iZza);
                        continue;
                        break;
                }
            } else {
                str = "\\\\";
            }
            sb2.append(str);
        }
        return sb2.toString();
    }
}
