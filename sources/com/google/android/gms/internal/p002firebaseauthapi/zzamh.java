package com.google.android.gms.internal.p002firebaseauthapi;

/* JADX INFO: loaded from: classes.dex */
final class zzamh {
    static String zza(zzaip zzaipVar) {
        String str;
        zzamg zzamgVar = new zzamg(zzaipVar);
        StringBuilder sb2 = new StringBuilder(zzamgVar.zza());
        for (int i10 = 0; i10 < zzamgVar.zza(); i10++) {
            int iZza = zzamgVar.zza(i10);
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
