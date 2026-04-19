package com.google.android.recaptcha.internal;

import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public class zzlc extends IOException {
    private boolean zza;

    public zzlc(IOException iOException) {
        super(iOException.getMessage(), iOException);
    }

    public zzlc(String str) {
        super(str);
    }

    static zzlb zza() {
        return new zzlb("Protocol message tag had invalid wire type.");
    }

    static zzlc zzb() {
        return new zzlc("Protocol message end-group tag did not match expected tag.");
    }

    static zzlc zzc() {
        return new zzlc("Protocol message contained an invalid tag (zero).");
    }

    static zzlc zzd() {
        return new zzlc("Protocol message had invalid UTF-8.");
    }

    static zzlc zze() {
        return new zzlc("CodedInputStream encountered a malformed varint.");
    }

    static zzlc zzf() {
        return new zzlc("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    static zzlc zzg() {
        return new zzlc("Failed to parse the message.");
    }

    static zzlc zzh() {
        return new zzlc("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    static zzlc zzi() {
        return new zzlc("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    final void zzj() {
        this.zza = true;
    }

    final boolean zzk() {
        return this.zza;
    }
}
