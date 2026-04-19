package com.google.android.gms.internal.mlkit_vision_document_scanner;

import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import ga.b;
import ga.c;
import ga.d;
import ga.e;
import ga.f;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class zzax implements e {
    private static final Charset zza = Charset.forName("UTF-8");
    private static final c zzb;
    private static final c zzc;
    private static final d zzd;
    private OutputStream zze;
    private final Map zzf;
    private final Map zzg;
    private final d zzh;
    private final zzbb zzi = new zzbb(this);

    static {
        c.b bVarA = c.a(SubscriberAttributeKt.JSON_NAME_KEY);
        zzar zzarVar = new zzar();
        zzarVar.zza(1);
        zzb = bVarA.b(zzarVar.zzb()).a();
        c.b bVarA2 = c.a("value");
        zzar zzarVar2 = new zzar();
        zzarVar2.zza(2);
        zzc = bVarA2.b(zzarVar2.zzb()).a();
        zzd = new d() { // from class: com.google.android.gms.internal.mlkit_vision_document_scanner.zzaw
            @Override // ga.d
            public final void encode(Object obj, Object obj2) {
                zzax.zzg((Map.Entry) obj, (e) obj2);
            }
        };
    }

    zzax(OutputStream outputStream, Map map, Map map2, d dVar) {
        this.zze = outputStream;
        this.zzf = map;
        this.zzg = map2;
        this.zzh = dVar;
    }

    static /* synthetic */ void zzg(Map.Entry entry, e eVar) {
        eVar.add(zzb, entry.getKey());
        eVar.add(zzc, entry.getValue());
    }

    private static int zzh(c cVar) {
        zzav zzavVar = (zzav) cVar.c(zzav.class);
        if (zzavVar != null) {
            return zzavVar.zza();
        }
        throw new b("Field has no @Protobuf config");
    }

    private final long zzi(d dVar, Object obj) throws IOException {
        zzas zzasVar = new zzas();
        try {
            OutputStream outputStream = this.zze;
            this.zze = zzasVar;
            try {
                dVar.encode(obj, this);
                this.zze = outputStream;
                long jZza = zzasVar.zza();
                zzasVar.close();
                return jZza;
            } catch (Throwable th) {
                this.zze = outputStream;
                throw th;
            }
        } catch (Throwable th2) {
            try {
                zzasVar.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    private static zzav zzj(c cVar) {
        zzav zzavVar = (zzav) cVar.c(zzav.class);
        if (zzavVar != null) {
            return zzavVar;
        }
        throw new b("Field has no @Protobuf config");
    }

    private final zzax zzk(d dVar, c cVar, Object obj, boolean z10) throws IOException {
        long jZzi = zzi(dVar, obj);
        if (z10 && jZzi == 0) {
            return this;
        }
        zzn((zzh(cVar) << 3) | 2);
        zzo(jZzi);
        dVar.encode(obj, this);
        return this;
    }

    private final zzax zzl(f fVar, c cVar, Object obj, boolean z10) {
        this.zzi.zza(cVar, z10);
        fVar.encode(obj, this.zzi);
        return this;
    }

    private static ByteBuffer zzm(int i10) {
        return ByteBuffer.allocate(i10).order(ByteOrder.LITTLE_ENDIAN);
    }

    private final void zzn(int i10) throws IOException {
        while (true) {
            int i11 = i10 & 127;
            if ((i10 & (-128)) == 0) {
                this.zze.write(i11);
                return;
            } else {
                this.zze.write(i11 | 128);
                i10 >>>= 7;
            }
        }
    }

    private final void zzo(long j10) throws IOException {
        while (true) {
            int i10 = ((int) j10) & 127;
            if (((-128) & j10) == 0) {
                this.zze.write(i10);
                return;
            } else {
                this.zze.write(i10 | 128);
                j10 >>>= 7;
            }
        }
    }

    public final e add(c cVar, double d10) throws IOException {
        zza(cVar, d10, true);
        return this;
    }

    public final e add(c cVar, float f10) throws IOException {
        zzb(cVar, f10, true);
        return this;
    }

    public final /* synthetic */ e add(c cVar, int i10) throws IOException {
        zzd(cVar, i10, true);
        return this;
    }

    @Override // ga.e
    public final /* synthetic */ e add(c cVar, long j10) throws IOException {
        zze(cVar, j10, true);
        return this;
    }

    @Override // ga.e
    public final e add(c cVar, Object obj) throws IOException {
        zzc(cVar, obj, true);
        return this;
    }

    public final /* synthetic */ e add(c cVar, boolean z10) throws IOException {
        zzd(cVar, z10 ? 1 : 0, true);
        return this;
    }

    public final e add(String str, double d10) throws IOException {
        zza(c.d(str), d10, true);
        return this;
    }

    public final e add(String str, int i10) throws IOException {
        zzd(c.d(str), i10, true);
        return this;
    }

    public final e add(String str, long j10) throws IOException {
        zze(c.d(str), j10, true);
        return this;
    }

    public final e add(String str, Object obj) throws IOException {
        zzc(c.d(str), obj, true);
        return this;
    }

    public final e add(String str, boolean z10) throws IOException {
        zzd(c.d(str), z10 ? 1 : 0, true);
        return this;
    }

    public final e inline(Object obj) {
        zzf(obj);
        return this;
    }

    public final e nested(c cVar) {
        throw new b("nested() is not implemented for protobuf encoding.");
    }

    public final e nested(String str) {
        return nested(c.d(str));
    }

    final e zza(c cVar, double d10, boolean z10) throws IOException {
        if (z10 && d10 == 0.0d) {
            return this;
        }
        zzn((zzh(cVar) << 3) | 1);
        this.zze.write(zzm(8).putDouble(d10).array());
        return this;
    }

    final e zzb(c cVar, float f10, boolean z10) throws IOException {
        if (z10 && f10 == 0.0f) {
            return this;
        }
        zzn((zzh(cVar) << 3) | 5);
        this.zze.write(zzm(4).putFloat(f10).array());
        return this;
    }

    final e zzc(c cVar, Object obj, boolean z10) throws IOException {
        if (obj != null) {
            if (obj instanceof CharSequence) {
                CharSequence charSequence = (CharSequence) obj;
                if (!z10 || charSequence.length() != 0) {
                    zzn((zzh(cVar) << 3) | 2);
                    byte[] bytes = charSequence.toString().getBytes(zza);
                    zzn(bytes.length);
                    this.zze.write(bytes);
                    return this;
                }
            } else if (obj instanceof Collection) {
                Iterator it = ((Collection) obj).iterator();
                while (it.hasNext()) {
                    zzc(cVar, it.next(), false);
                }
            } else if (obj instanceof Map) {
                Iterator it2 = ((Map) obj).entrySet().iterator();
                while (it2.hasNext()) {
                    zzk(zzd, cVar, (Map.Entry) it2.next(), false);
                }
            } else {
                if (obj instanceof Double) {
                    zza(cVar, ((Double) obj).doubleValue(), z10);
                    return this;
                }
                if (obj instanceof Float) {
                    zzb(cVar, ((Float) obj).floatValue(), z10);
                    return this;
                }
                if (obj instanceof Number) {
                    zze(cVar, ((Number) obj).longValue(), z10);
                    return this;
                }
                if (obj instanceof Boolean) {
                    zzd(cVar, ((Boolean) obj).booleanValue() ? 1 : 0, z10);
                    return this;
                }
                if (!(obj instanceof byte[])) {
                    d dVar = (d) this.zzf.get(obj.getClass());
                    if (dVar != null) {
                        zzk(dVar, cVar, obj, z10);
                        return this;
                    }
                    f fVar = (f) this.zzg.get(obj.getClass());
                    if (fVar != null) {
                        zzl(fVar, cVar, obj, z10);
                        return this;
                    }
                    if (obj instanceof zzat) {
                        zzd(cVar, ((zzat) obj).zza(), true);
                        return this;
                    }
                    if (obj instanceof Enum) {
                        zzd(cVar, ((Enum) obj).ordinal(), true);
                        return this;
                    }
                    zzk(this.zzh, cVar, obj, z10);
                    return this;
                }
                byte[] bArr = (byte[]) obj;
                if (!z10 || bArr.length != 0) {
                    zzn((zzh(cVar) << 3) | 2);
                    zzn(bArr.length);
                    this.zze.write(bArr);
                    return this;
                }
            }
        }
        return this;
    }

    final zzax zzd(c cVar, int i10, boolean z10) throws IOException {
        if (!z10 || i10 != 0) {
            zzav zzavVarZzj = zzj(cVar);
            zzau zzauVar = zzau.DEFAULT;
            int iOrdinal = zzavVarZzj.zzb().ordinal();
            if (iOrdinal == 0) {
                zzn(zzavVarZzj.zza() << 3);
                zzn(i10);
            } else if (iOrdinal == 1) {
                zzn(zzavVarZzj.zza() << 3);
                zzn((i10 + i10) ^ (i10 >> 31));
            } else if (iOrdinal == 2) {
                zzn((zzavVarZzj.zza() << 3) | 5);
                this.zze.write(zzm(4).putInt(i10).array());
            }
        }
        return this;
    }

    final zzax zze(c cVar, long j10, boolean z10) throws IOException {
        if (!z10 || j10 != 0) {
            zzav zzavVarZzj = zzj(cVar);
            zzau zzauVar = zzau.DEFAULT;
            int iOrdinal = zzavVarZzj.zzb().ordinal();
            if (iOrdinal == 0) {
                zzn(zzavVarZzj.zza() << 3);
                zzo(j10);
            } else if (iOrdinal == 1) {
                zzn(zzavVarZzj.zza() << 3);
                zzo((j10 >> 63) ^ (j10 + j10));
            } else if (iOrdinal == 2) {
                zzn((zzavVarZzj.zza() << 3) | 1);
                this.zze.write(zzm(8).putLong(j10).array());
            }
        }
        return this;
    }

    final zzax zzf(Object obj) {
        if (obj == null) {
            return this;
        }
        d dVar = (d) this.zzf.get(obj.getClass());
        if (dVar == null) {
            throw new b("No encoder for ".concat(String.valueOf(obj.getClass())));
        }
        dVar.encode(obj, this);
        return this;
    }
}
