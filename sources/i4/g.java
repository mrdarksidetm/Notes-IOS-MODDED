package i4;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.EditText;
import androidx.emoji2.text.e;
import com.google.android.gms.common.api.a;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
final class g implements TextWatcher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final EditText f12511a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f12512b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private e.f f12513c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f12514d = a.e.API_PRIORITY_OTHER;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f12515e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f12516f = true;

    private static class a extends e.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Reference<EditText> f12517a;

        a(EditText editText) {
            this.f12517a = new WeakReference(editText);
        }

        @Override // androidx.emoji2.text.e.f
        public void b() {
            super.b();
            g.b(this.f12517a.get(), 1);
        }
    }

    g(EditText editText, boolean z10) {
        this.f12511a = editText;
        this.f12512b = z10;
    }

    private e.f a() {
        if (this.f12513c == null) {
            this.f12513c = new a(this.f12511a);
        }
        return this.f12513c;
    }

    static void b(EditText editText, int i10) {
        if (i10 == 1 && editText != null && editText.isAttachedToWindow()) {
            Editable editableText = editText.getEditableText();
            int selectionStart = Selection.getSelectionStart(editableText);
            int selectionEnd = Selection.getSelectionEnd(editableText);
            androidx.emoji2.text.e.c().p(editableText);
            d.b(editableText, selectionStart, selectionEnd);
        }
    }

    private boolean d() {
        return (this.f12516f && (this.f12512b || androidx.emoji2.text.e.i())) ? false : true;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    public void c(boolean z10) {
        if (this.f12516f != z10) {
            if (this.f12513c != null) {
                androidx.emoji2.text.e.c().u(this.f12513c);
            }
            this.f12516f = z10;
            if (z10) {
                b(this.f12511a, androidx.emoji2.text.e.c().e());
            }
        }
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        if (this.f12511a.isInEditMode() || d() || i11 > i12 || !(charSequence instanceof Spannable)) {
            return;
        }
        int iE = androidx.emoji2.text.e.c().e();
        if (iE != 0) {
            if (iE == 1) {
                androidx.emoji2.text.e.c().s((Spannable) charSequence, i10, i10 + i12, this.f12514d, this.f12515e);
                return;
            } else if (iE != 3) {
                return;
            }
        }
        androidx.emoji2.text.e.c().t(a());
    }
}
