package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzvq;
import com.google.android.gms.internal.p002firebaseauthapi.zzwa;
import java.security.GeneralSecurityException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class zzbt {
    private final zzwa zza;
    private final List<zzca> zzb;
    private final zzng zzc;

    private zzbt(zzwa zzwaVar, List<zzca> list) {
        this.zza = zzwaVar;
        this.zzb = list;
        this.zzc = zzng.zza;
    }

    private zzbt(zzwa zzwaVar, List<zzca> list, zzng zzngVar) {
        this.zza = zzwaVar;
        this.zzb = list;
        this.zzc = zzngVar;
    }

    private static zzbp zza(zzwa.zzb zzbVar) {
        zzpc zzpcVarZza = zzpc.zza(zzbVar.zzb().zzf(), zzbVar.zzb().zze(), zzbVar.zzb().zzb(), zzbVar.zzf(), zzbVar.zzf() == zzws.RAW ? null : Integer.valueOf(zzbVar.zza()));
        zzof zzofVarZza = zzof.zza();
        zzcn zzcnVarZza = zzcn.zza();
        return !zzofVarZza.zzb(zzpcVarZza) ? new zznc(zzpcVarZza, zzcnVarZza) : zzofVarZza.zza(zzpcVarZza, zzcnVarZza);
    }

    private static zzbr zza(zzvv zzvvVar) throws GeneralSecurityException {
        int i10 = zzbw.zza[zzvvVar.ordinal()];
        if (i10 == 1) {
            return zzbr.zza;
        }
        if (i10 == 2) {
            return zzbr.zzb;
        }
        if (i10 == 3) {
            return zzbr.zzc;
        }
        throw new GeneralSecurityException("Unknown key status");
    }

    public static final zzbt zza(zzbu zzbuVar) {
        return new zzbv().zza(new zzby(zzbuVar.zza()).zzb().zza()).zza();
    }

    public static final zzbt zza(zzcb zzcbVar, zzbg zzbgVar, byte[] bArr) throws GeneralSecurityException {
        zzuo zzuoVarZza = zzcbVar.zza();
        if (zzuoVarZza == null || zzuoVarZza.zzc().zzb() == 0) {
            throw new GeneralSecurityException("empty keyset");
        }
        return zza(zza(zzuoVarZza, zzbgVar, bArr));
    }

    static final zzbt zza(zzwa zzwaVar) throws GeneralSecurityException {
        zzd(zzwaVar);
        return new zzbt(zzwaVar, zzc(zzwaVar));
    }

    private static zzwa zza(zzuo zzuoVar, zzbg zzbgVar, byte[] bArr) throws GeneralSecurityException {
        try {
            zzwa zzwaVarZza = zzwa.zza(zzbgVar.zza(zzuoVar.zzc().zzd(), bArr), zzajk.zza());
            zzd(zzwaVarZza);
            return zzwaVarZza;
        } catch (zzakf unused) {
            throw new GeneralSecurityException("invalid keyset, corrupted key material");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final <B, P> P zza(zzmq zzmqVar, Class<P> cls, Class<B> cls2) throws GeneralSecurityException {
        zzcs.zzb(this.zza);
        zzoy zzoyVarZza = zzoz.zza(cls2);
        zzoyVarZza.zza(this.zzc);
        for (int i10 = 0; i10 < this.zzb.size(); i10++) {
            zzwa.zzb zzbVarZza = this.zza.zza(i10);
            if (zzbVarZza.zzc().equals(zzvv.ENABLED)) {
                zzca zzcaVar = this.zzb.get(i10);
                if (zzcaVar == null) {
                    throw new GeneralSecurityException("Key parsing of key with index " + i10 + " and type_url " + zzbVarZza.zzb().zzf() + " failed, unable to get primitive");
                }
                zzbp zzbpVarZzb = zzcaVar.zzb();
                try {
                    Object objZza = zzmqVar.zza(zzbpVarZzb, cls2);
                    if (zzbVarZza.zza() == this.zza.zzb()) {
                        zzoyVarZza.zzb(objZza, zzbpVarZzb, zzbVarZza);
                    } else {
                        zzoyVarZza.zza(objZza, zzbpVarZzb, zzbVarZza);
                    }
                } catch (GeneralSecurityException e10) {
                    throw new GeneralSecurityException("Unable to get primitive " + String.valueOf(cls2) + " for key of type " + zzbVarZza.zzb().zzf() + ", see https://developers.google.com/tink/faq/registration_errors", e10);
                }
            }
        }
        return (P) zzmqVar.zza(zzoyVarZza.zza(), cls);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzwa.zzb zzb(zzbp zzbpVar, zzbr zzbrVar, int i10) throws GeneralSecurityException {
        zzvv zzvvVar;
        zzpc zzpcVar = (zzpc) zzof.zza().zza(zzbpVar, zzpc.class, zzcn.zza());
        Integer numZze = zzpcVar.zze();
        if (numZze != null && numZze.intValue() != i10) {
            throw new GeneralSecurityException("Wrong ID set for key with ID requirement");
        }
        if (zzbr.zza.equals(zzbrVar)) {
            zzvvVar = zzvv.ENABLED;
        } else if (zzbr.zzb.equals(zzbrVar)) {
            zzvvVar = zzvv.DISABLED;
        } else {
            if (!zzbr.zzc.equals(zzbrVar)) {
                throw new IllegalStateException("Unknown key status");
            }
            zzvvVar = zzvv.DESTROYED;
        }
        return (zzwa.zzb) ((zzajy) zzwa.zzb.zzd().zza(zzvq.zza().zza(zzpcVar.zzf()).zza(zzpcVar.zzd()).zza(zzpcVar.zza())).zza(zzvvVar).zza(i10).zza(zzpcVar.zzb()).zze());
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ProcessVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Method arg registers not loaded: com.google.android.gms.internal.firebase-auth-api.zzca.<init>(com.google.android.gms.internal.firebase-auth-api.zzbp, com.google.android.gms.internal.firebase-auth-api.zzbr, int, boolean, com.google.android.gms.internal.firebase-auth-api.zzbz):void, class status: GENERATED_AND_UNLOADED
        	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:298)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.isArgUnused(ProcessVariables.java:146)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.lambda$isVarUnused$0(ProcessVariables.java:131)
        	at jadx.core.utils.ListUtils.allMatch(ListUtils.java:197)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.isVarUnused(ProcessVariables.java:131)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.processBlock(ProcessVariables.java:82)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:64)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.removeUnusedResults(ProcessVariables.java:73)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.visit(ProcessVariables.java:48)
        */
    private static java.util.List<com.google.android.gms.internal.p002firebaseauthapi.zzca> zzc(com.google.android.gms.internal.p002firebaseauthapi.zzwa r10) {
        /*
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r10.zza()
            r0.<init>(r1)
            java.util.List r1 = r10.zze()
            java.util.Iterator r1 = r1.iterator()
        L11:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L47
            java.lang.Object r2 = r1.next()
            com.google.android.gms.internal.firebase-auth-api.zzwa$zzb r2 = (com.google.android.gms.internal.firebase-auth-api.zzwa.zzb) r2
            int r6 = r2.zza()
            com.google.android.gms.internal.firebase-auth-api.zzbp r4 = zza(r2)     // Catch: java.security.GeneralSecurityException -> L42
            com.google.android.gms.internal.firebase-auth-api.zzca r9 = new com.google.android.gms.internal.firebase-auth-api.zzca     // Catch: java.security.GeneralSecurityException -> L42
            com.google.android.gms.internal.firebase-auth-api.zzvv r2 = r2.zzc()     // Catch: java.security.GeneralSecurityException -> L42
            com.google.android.gms.internal.firebase-auth-api.zzbr r5 = zza(r2)     // Catch: java.security.GeneralSecurityException -> L42
            int r2 = r10.zzb()     // Catch: java.security.GeneralSecurityException -> L42
            if (r6 != r2) goto L37
            r2 = 1
            goto L38
        L37:
            r2 = 0
        L38:
            r7 = r2
            r8 = 0
            r3 = r9
            r3.<init>(r4, r5, r6, r7)     // Catch: java.security.GeneralSecurityException -> L42
            r0.add(r9)     // Catch: java.security.GeneralSecurityException -> L42
            goto L11
        L42:
            r2 = 0
            r0.add(r2)
            goto L11
        L47:
            java.util.List r10 = java.util.Collections.unmodifiableList(r0)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p002firebaseauthapi.zzbt.zzc(com.google.android.gms.internal.firebase-auth-api.zzwa):java.util.List");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzd(zzwa zzwaVar) throws GeneralSecurityException {
        if (zzwaVar == null || zzwaVar.zza() <= 0) {
            throw new GeneralSecurityException("empty keyset");
        }
    }

    public final String toString() {
        return zzcs.zza(this.zza).toString();
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ProcessVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Method arg registers not loaded: com.google.android.gms.internal.firebase-auth-api.zzca.<init>(com.google.android.gms.internal.firebase-auth-api.zzbp, com.google.android.gms.internal.firebase-auth-api.zzbr, int, boolean, com.google.android.gms.internal.firebase-auth-api.zzbz):void, class status: GENERATED_AND_UNLOADED
        	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:298)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.isArgUnused(ProcessVariables.java:146)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.lambda$isVarUnused$0(ProcessVariables.java:131)
        	at jadx.core.utils.ListUtils.allMatch(ListUtils.java:197)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.isVarUnused(ProcessVariables.java:131)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.processBlock(ProcessVariables.java:82)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:64)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1118)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1118)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.removeUnusedResults(ProcessVariables.java:73)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.visit(ProcessVariables.java:48)
        */
    public final com.google.android.gms.internal.p002firebaseauthapi.zzbt zza() throws java.security.GeneralSecurityException {
        /*
            Method dump skipped, instruction units count: 228
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p002firebaseauthapi.zzbt.zza():com.google.android.gms.internal.firebase-auth-api.zzbt");
    }

    public final <P> P zza(zzbk zzbkVar, Class<P> cls) throws GeneralSecurityException {
        if (!(zzbkVar instanceof zzmq)) {
            throw new GeneralSecurityException("Currently only subclasses of InternalConfiguration are accepted");
        }
        zzmq zzmqVar = (zzmq) zzbkVar;
        Class<?> clsZza = zzmqVar.zza(cls);
        if (clsZza != null) {
            return (P) zza(zzmqVar, cls, clsZza);
        }
        throw new GeneralSecurityException("No wrapper found for " + cls.getName());
    }

    public final void zza(zzce zzceVar) throws GeneralSecurityException {
        for (zzwa.zzb zzbVar : this.zza.zze()) {
            if (zzbVar.zzb().zzb() == zzvq.zzb.UNKNOWN_KEYMATERIAL || zzbVar.zzb().zzb() == zzvq.zzb.SYMMETRIC || zzbVar.zzb().zzb() == zzvq.zzb.ASYMMETRIC_PRIVATE) {
                throw new GeneralSecurityException(String.format("keyset contains key material of type %s for type url %s", zzbVar.zzb().zzb().name(), zzbVar.zzb().zzf()));
            }
        }
        zzceVar.zza(this.zza);
    }

    public final void zza(zzce zzceVar, zzbg zzbgVar, byte[] bArr) {
        zzwa zzwaVar = this.zza;
        zzceVar.zza((zzuo) ((zzajy) zzuo.zza().zza(zzaip.zza(zzbgVar.zzb(zzwaVar.zzk(), bArr))).zza(zzcs.zza(zzwaVar)).zze()));
    }

    final zzwa zzb() {
        return this.zza;
    }
}
