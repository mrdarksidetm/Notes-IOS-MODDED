package com.google.android.recaptcha.internal;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'zzc' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes2.dex */
public final class zznm {
    public static final zznm zza;
    public static final zznm zzb;
    public static final zznm zzc;
    public static final zznm zzd;
    public static final zznm zze;
    public static final zznm zzf;
    public static final zznm zzg;
    public static final zznm zzh;
    public static final zznm zzi;
    public static final zznm zzj;
    public static final zznm zzk;
    public static final zznm zzl;
    public static final zznm zzm;
    public static final zznm zzn;
    public static final zznm zzo;
    public static final zznm zzp;
    public static final zznm zzq;
    public static final zznm zzr;
    private static final /* synthetic */ zznm[] zzs;
    private final zznn zzt;

    static {
        zznm zznmVar = new zznm("DOUBLE", 0, zznn.DOUBLE, 1);
        zza = zznmVar;
        zznm zznmVar2 = new zznm("FLOAT", 1, zznn.FLOAT, 5);
        zzb = zznmVar2;
        zznn zznnVar = zznn.LONG;
        zznm zznmVar3 = new zznm("INT64", 2, zznnVar, 0);
        zzc = zznmVar3;
        zznm zznmVar4 = new zznm("UINT64", 3, zznnVar, 0);
        zzd = zznmVar4;
        zznn zznnVar2 = zznn.INT;
        zznm zznmVar5 = new zznm("INT32", 4, zznnVar2, 0);
        zze = zznmVar5;
        zznm zznmVar6 = new zznm("FIXED64", 5, zznnVar, 1);
        zzf = zznmVar6;
        zznm zznmVar7 = new zznm("FIXED32", 6, zznnVar2, 5);
        zzg = zznmVar7;
        zznm zznmVar8 = new zznm("BOOL", 7, zznn.BOOLEAN, 0);
        zzh = zznmVar8;
        zznm zznmVar9 = new zznm("STRING", 8, zznn.STRING, 2);
        zzi = zznmVar9;
        zznn zznnVar3 = zznn.MESSAGE;
        zznm zznmVar10 = new zznm("GROUP", 9, zznnVar3, 3);
        zzj = zznmVar10;
        zznm zznmVar11 = new zznm("MESSAGE", 10, zznnVar3, 2);
        zzk = zznmVar11;
        zznm zznmVar12 = new zznm("BYTES", 11, zznn.BYTE_STRING, 2);
        zzl = zznmVar12;
        zznm zznmVar13 = new zznm("UINT32", 12, zznnVar2, 0);
        zzm = zznmVar13;
        zznm zznmVar14 = new zznm("ENUM", 13, zznn.ENUM, 0);
        zzn = zznmVar14;
        zznm zznmVar15 = new zznm("SFIXED32", 14, zznnVar2, 5);
        zzo = zznmVar15;
        zznm zznmVar16 = new zznm("SFIXED64", 15, zznnVar, 1);
        zzp = zznmVar16;
        zznm zznmVar17 = new zznm("SINT32", 16, zznnVar2, 0);
        zzq = zznmVar17;
        zznm zznmVar18 = new zznm("SINT64", 17, zznnVar, 0);
        zzr = zznmVar18;
        zzs = new zznm[]{zznmVar, zznmVar2, zznmVar3, zznmVar4, zznmVar5, zznmVar6, zznmVar7, zznmVar8, zznmVar9, zznmVar10, zznmVar11, zznmVar12, zznmVar13, zznmVar14, zznmVar15, zznmVar16, zznmVar17, zznmVar18};
    }

    private zznm(String str, int i10, zznn zznnVar, int i11) {
        this.zzt = zznnVar;
    }

    public static zznm[] values() {
        return (zznm[]) zzs.clone();
    }

    public final zznn zza() {
        return this.zzt;
    }
}
