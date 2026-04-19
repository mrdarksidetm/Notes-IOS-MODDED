package com.revenuecat.purchases.common.diagnostics;

import ae.j;
import ae.r;
import com.revenuecat.purchases.common.FileHelper;
import com.revenuecat.purchases.utils.EventsFileHelper;

/* JADX INFO: loaded from: classes2.dex */
public final class DiagnosticsFileHelper extends EventsFileHelper<DiagnosticsEntry> {
    public static final Companion Companion = new Companion(null);
    public static final int DIAGNOSTICS_FILE_LIMIT_IN_KB = 500;
    public static final String DIAGNOSTICS_FILE_PATH = "RevenueCat/diagnostics/diagnostic_entries.jsonl";
    private final FileHelper fileHelper;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(j jVar) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DiagnosticsFileHelper(FileHelper fileHelper) {
        super(fileHelper, DIAGNOSTICS_FILE_PATH, null);
        r.f(fileHelper, "fileHelper");
        this.fileHelper = fileHelper;
    }

    public final synchronized boolean isDiagnosticsFileTooBig() {
        return this.fileHelper.fileSizeInKB(DIAGNOSTICS_FILE_PATH) > 500.0d;
    }
}
