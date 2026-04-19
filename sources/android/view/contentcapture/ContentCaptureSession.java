package android.view.contentcapture;

import android.view.View;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public /* synthetic */ class ContentCaptureSession implements AutoCloseable {
    static {
        throw new NoClassDefFoundError();
    }

    public native /* synthetic */ AutofillId newAutofillId(AutofillId autofillId, long j10);

    public final native /* synthetic */ ViewStructure newViewStructure(View view);

    public final native /* synthetic */ ViewStructure newVirtualViewStructure(AutofillId autofillId, long j10);

    public final native /* synthetic */ void notifyViewAppeared(ViewStructure viewStructure);

    public final native /* synthetic */ void notifyViewTextChanged(AutofillId autofillId, CharSequence charSequence);

    public final native /* synthetic */ void notifyViewsAppeared(List<ViewStructure> list);

    public final native /* synthetic */ void notifyViewsDisappeared(AutofillId autofillId, long[] jArr);
}
