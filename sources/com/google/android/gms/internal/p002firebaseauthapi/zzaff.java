package com.google.android.gms.internal.p002firebaseauthapi;

/* JADX INFO: loaded from: classes.dex */
final class zzaff extends zzagt {
    private final String zza;
    private final String zzb;

    zzaff(String str, String str2) {
        this.zza = str;
        this.zzb = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzagt) {
            zzagt zzagtVar = (zzagt) obj;
            String str = this.zza;
            if (str != null ? str.equals(zzagtVar.zzb()) : zzagtVar.zzb() == null) {
                String str2 = this.zzb;
                String strZza = zzagtVar.zza();
                if (str2 != null ? str2.equals(strZza) : strZza == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.zza;
        int iHashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.zzb;
        return iHashCode ^ (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return "RecaptchaEnforcementState{provider=" + this.zza + ", enforcementState=" + this.zzb + "}";
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzagt
    final String zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzagt
    final String zzb() {
        return this.zza;
    }
}
