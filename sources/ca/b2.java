package ca;

import com.google.android.gms.internal.p002firebaseauthapi.zzagv;

/* JADX INFO: loaded from: classes2.dex */
public final class b2 implements ba.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f6620a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f6621b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f6622c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ba.b f6623d;

    public b2(zzagv zzagvVar) {
        int i10;
        this.f6621b = zzagvVar.zzg() ? zzagvVar.zzc() : zzagvVar.zzb();
        this.f6622c = zzagvVar.zzb();
        ba.b z1Var = null;
        if (!zzagvVar.zzh()) {
            this.f6620a = 3;
            this.f6623d = null;
            return;
        }
        String strZzd = zzagvVar.zzd();
        strZzd.hashCode();
        i10 = 5;
        switch (strZzd) {
            case "REVERT_SECOND_FACTOR_ADDITION":
                i10 = 6;
                break;
            case "PASSWORD_RESET":
                i10 = 0;
                break;
            case "VERIFY_EMAIL":
                i10 = 1;
                break;
            case "VERIFY_AND_CHANGE_EMAIL":
                break;
            case "EMAIL_SIGNIN":
                i10 = 4;
                break;
            case "RECOVER_EMAIL":
                i10 = 2;
                break;
            default:
                i10 = 3;
                break;
        }
        this.f6620a = i10;
        if (i10 == 4 || i10 == 3) {
            this.f6623d = null;
            return;
        }
        if (zzagvVar.zzf()) {
            z1Var = new y1(zzagvVar.zzb(), l0.a(zzagvVar.zza()));
        } else if (zzagvVar.zzg()) {
            z1Var = new w1(zzagvVar.zzc(), zzagvVar.zzb());
        } else if (zzagvVar.zze()) {
            z1Var = new z1(zzagvVar.zzb());
        }
        this.f6623d = z1Var;
    }

    @Override // ba.d
    public final int a() {
        return this.f6620a;
    }

    @Override // ba.d
    public final ba.b b() {
        return this.f6623d;
    }
}
