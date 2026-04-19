package com.google.mlkit.vision.documentscanner.internal;

import android.content.Intent;
import com.google.android.gms.internal.mlkit_vision_document_scanner.zzaa;
import com.google.android.gms.internal.mlkit_vision_document_scanner.zzlm;
import com.google.android.gms.internal.mlkit_vision_document_scanner.zzln;
import com.google.android.gms.internal.mlkit_vision_document_scanner.zzlo;
import com.google.android.gms.internal.mlkit_vision_document_scanner.zzlq;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class e {
    static zzlq a(Intent intent) {
        zzlm zzlmVar = new zzlm();
        ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("uri_array_extra_initial_image_uris");
        if (parcelableArrayListExtra != null) {
            zzlmVar.zzg(Integer.valueOf(parcelableArrayListExtra.size()));
        }
        int intExtra = intent.getIntExtra("int_extra_default_capture_mode", -1);
        zzlmVar.zzb(intExtra != 1 ? intExtra != 2 ? zzln.MODE_UNKNOWN : zzln.MODE_MANUAL : zzln.MODE_AUTO);
        zzlmVar.zze(Boolean.valueOf(intent.getBooleanExtra("boolean_extra_flash_mode_change_allowed", false)));
        zzlmVar.zzf(Boolean.valueOf(intent.getBooleanExtra("boolean_extra_gallery_import_allowed", false)));
        zzlmVar.zzh(Boolean.valueOf(intent.getIntExtra("int_extra_page_limit_max", -1) != 1));
        zzlmVar.zzj(Integer.valueOf(intent.getIntExtra("int_extra_page_limit_max", -1)));
        zzlmVar.zzc(Boolean.valueOf(intent.getBooleanExtra("boolean_extra_enable_all_new_features_by_default", false)));
        zzlmVar.zzd(Boolean.valueOf(intent.getBooleanExtra("boolean_extra_filter_allowed", false)));
        zzlmVar.zzl(Boolean.valueOf(intent.getBooleanExtra("boolean_extra_shadow_removal_allowed", false)));
        zzlmVar.zzm(Boolean.valueOf(intent.getBooleanExtra("boolean_extra_stain_removal_allowed", false)));
        zzaa zzaaVar = new zzaa();
        int[] intArrayExtra = intent.getIntArrayExtra("int_array_extra_result_formats");
        if (intArrayExtra != null) {
            for (int i10 : intArrayExtra) {
                zzaaVar.zza(c(i10));
            }
        }
        zzlmVar.zzk(zzaaVar.zzb());
        zzlmVar.zzi(Boolean.valueOf(intent.getBooleanExtra("boolean_extra_page_edit_listener_enabled", false)));
        return zzlmVar.zzo();
    }

    static zzlq b(ya.b bVar) {
        zzlm zzlmVar = new zzlm();
        zzlmVar.zzb(zzln.MODE_AUTO);
        zzlmVar.zze(Boolean.TRUE);
        zzlmVar.zzf(Boolean.valueOf(bVar.d()));
        zzlmVar.zzj(Integer.valueOf(bVar.a()));
        zzlmVar.zzc(Boolean.valueOf(bVar.b()));
        zzlmVar.zzd(Boolean.valueOf(bVar.c()));
        zzlmVar.zzl(Boolean.valueOf(bVar.e()));
        zzlmVar.zzm(Boolean.valueOf(bVar.f()));
        zzaa zzaaVar = new zzaa();
        for (int i10 : bVar.g()) {
            zzaaVar.zza(c(i10));
        }
        zzlmVar.zzk(zzaaVar.zzb());
        zzlmVar.zzi(Boolean.FALSE);
        return zzlmVar.zzo();
    }

    private static zzlo c(int i10) {
        return i10 != 101 ? i10 != 102 ? zzlo.FORMAT_UNKNOWN : zzlo.FORMAT_PDF : zzlo.FORMAT_JPEG;
    }
}
