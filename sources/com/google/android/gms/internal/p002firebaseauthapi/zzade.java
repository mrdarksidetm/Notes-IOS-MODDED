package com.google.android.gms.internal.p002firebaseauthapi;

import android.os.RemoteException;
import ba.o0;
import com.google.android.gms.common.api.Status;
import w8.m;
import z8.a;

/* JADX INFO: loaded from: classes.dex */
public class zzade {
    private final zzadf zza;
    private final a zzb;

    public zzade(zzade zzadeVar) {
        this(zzadeVar.zza, zzadeVar.zzb);
    }

    public zzade(zzadf zzadfVar, a aVar) {
        this.zza = (zzadf) m.k(zzadfVar);
        this.zzb = (a) m.k(aVar);
    }

    public final void zza() {
        try {
            this.zza.zza();
        } catch (RemoteException e10) {
            this.zzb.b("RemoteException when sending delete account response.", e10, new Object[0]);
        }
    }

    public final void zza(o0 o0Var) {
        try {
            this.zza.zza(o0Var);
        } catch (RemoteException e10) {
            this.zzb.b("RemoteException when sending verification completed response.", e10, new Object[0]);
        }
    }

    public void zza(Status status) {
        try {
            this.zza.zza(status);
        } catch (RemoteException e10) {
            this.zzb.b("RemoteException when sending failure result.", e10, new Object[0]);
        }
    }

    public final void zza(Status status, o0 o0Var) {
        try {
            this.zza.zza(status, o0Var);
        } catch (RemoteException e10) {
            this.zzb.b("RemoteException when sending failure result.", e10, new Object[0]);
        }
    }

    public final void zza(zzafl zzaflVar) {
        try {
            this.zza.zza(zzaflVar);
        } catch (RemoteException e10) {
            this.zzb.b("RemoteException when sending create auth uri response.", e10, new Object[0]);
        }
    }

    public final void zza(zzagh zzaghVar) {
        try {
            this.zza.zza(zzaghVar);
        } catch (RemoteException e10) {
            this.zzb.b("RemoteException when sending Play Integrity Producer project response.", e10, new Object[0]);
        }
    }

    public final void zza(zzagl zzaglVar) {
        try {
            this.zza.zza(zzaglVar);
        } catch (RemoteException e10) {
            this.zzb.b("RemoteException when sending token result.", e10, new Object[0]);
        }
    }

    public final void zza(zzagl zzaglVar, zzage zzageVar) {
        try {
            this.zza.zza(zzaglVar, zzageVar);
        } catch (RemoteException e10) {
            this.zzb.b("RemoteException when sending get token and account info user response", e10, new Object[0]);
        }
    }

    public final void zza(zzagm zzagmVar) {
        try {
            this.zza.zza(zzagmVar);
        } catch (RemoteException e10) {
            this.zzb.b("RemoteException when sending get recaptcha config response.", e10, new Object[0]);
        }
    }

    public final void zza(zzagv zzagvVar) {
        try {
            this.zza.zza(zzagvVar);
        } catch (RemoteException e10) {
            this.zzb.b("RemoteException when sending password reset response.", e10, new Object[0]);
        }
    }

    public final void zza(zzaha zzahaVar) {
        try {
            this.zza.zza(zzahaVar);
        } catch (RemoteException e10) {
            this.zzb.b("RemoteException when sending revoke token response.", e10, new Object[0]);
        }
    }

    public final void zza(zzahh zzahhVar) {
        try {
            this.zza.zza(zzahhVar);
        } catch (RemoteException e10) {
            this.zzb.b("RemoteException when sending start mfa enrollment response.", e10, new Object[0]);
        }
    }

    public final void zza(zzzi zzziVar) {
        try {
            this.zza.zza(zzziVar);
        } catch (RemoteException e10) {
            this.zzb.b("RemoteException when sending failure result with credential", e10, new Object[0]);
        }
    }

    public final void zza(zzzl zzzlVar) {
        try {
            this.zza.zza(zzzlVar);
        } catch (RemoteException e10) {
            this.zzb.b("RemoteException when sending failure result for mfa", e10, new Object[0]);
        }
    }

    public final void zza(String str) {
        try {
            this.zza.zza(str);
        } catch (RemoteException e10) {
            this.zzb.b("RemoteException when sending auto retrieval timeout response.", e10, new Object[0]);
        }
    }

    public final void zzb() {
        try {
            this.zza.zzb();
        } catch (RemoteException e10) {
            this.zzb.b("RemoteException when sending email verification response.", e10, new Object[0]);
        }
    }

    public void zzb(String str) {
        try {
            this.zza.zzb(str);
        } catch (RemoteException e10) {
            this.zzb.b("RemoteException when sending send verification code response.", e10, new Object[0]);
        }
    }

    public final void zzc() {
        try {
            this.zza.zzc();
        } catch (RemoteException e10) {
            this.zzb.b("RemoteException when setting FirebaseUI Version", e10, new Object[0]);
        }
    }

    public final void zzc(String str) {
        try {
            this.zza.zzc(str);
        } catch (RemoteException e10) {
            this.zzb.b("RemoteException when sending set account info response.", e10, new Object[0]);
        }
    }
}
