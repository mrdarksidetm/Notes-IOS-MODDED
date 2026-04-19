package p2;

import android.R;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class a0 implements InputConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final l f18077a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f18078b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f18079c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private e0 f18080d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f18081e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f18082f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final List<h> f18083g = new ArrayList();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f18084h = true;

    public a0(e0 e0Var, l lVar, boolean z10) {
        this.f18077a = lVar;
        this.f18078b = z10;
        this.f18080d = e0Var;
    }

    private final void b(h hVar) {
        c();
        try {
            this.f18083g.add(hVar);
        } finally {
            d();
        }
    }

    private final boolean c() {
        this.f18079c++;
        return true;
    }

    private final boolean d() {
        int i10 = this.f18079c - 1;
        this.f18079c = i10;
        if (i10 == 0 && (!this.f18083g.isEmpty())) {
            this.f18077a.e(nd.c0.F0(this.f18083g));
            this.f18083g.clear();
        }
        return this.f18079c > 0;
    }

    private final void e(int i10) {
        sendKeyEvent(new KeyEvent(0, i10));
        sendKeyEvent(new KeyEvent(1, i10));
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean beginBatchEdit() {
        boolean z10 = this.f18084h;
        return z10 ? c() : z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean clearMetaKeyStates(int i10) {
        boolean z10 = this.f18084h;
        if (z10) {
            return false;
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public void closeConnection() {
        this.f18083g.clear();
        this.f18079c = 0;
        this.f18084h = false;
        this.f18077a.b(this);
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitCompletion(CompletionInfo completionInfo) {
        boolean z10 = this.f18084h;
        if (z10) {
            return false;
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitContent(InputContentInfo inputContentInfo, int i10, Bundle bundle) {
        boolean z10 = this.f18084h;
        if (z10) {
            return false;
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitCorrection(CorrectionInfo correctionInfo) {
        boolean z10 = this.f18084h;
        return z10 ? this.f18078b : z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitText(CharSequence charSequence, int i10) {
        boolean z10 = this.f18084h;
        if (z10) {
            b(new a(String.valueOf(charSequence), i10));
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean deleteSurroundingText(int i10, int i11) {
        boolean z10 = this.f18084h;
        if (!z10) {
            return z10;
        }
        b(new f(i10, i11));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean deleteSurroundingTextInCodePoints(int i10, int i11) {
        boolean z10 = this.f18084h;
        if (!z10) {
            return z10;
        }
        b(new g(i10, i11));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean endBatchEdit() {
        return d();
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean finishComposingText() {
        boolean z10 = this.f18084h;
        if (!z10) {
            return z10;
        }
        b(new i());
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public int getCursorCapsMode(int i10) {
        return TextUtils.getCapsMode(this.f18080d.d(), i2.e0.j(this.f18080d.c()), i10);
    }

    @Override // android.view.inputmethod.InputConnection
    public ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i10) {
        boolean z10 = (i10 & 1) != 0;
        this.f18082f = z10;
        if (z10) {
            this.f18081e = extractedTextRequest != null ? extractedTextRequest.token : 0;
        }
        return o.a(this.f18080d);
    }

    @Override // android.view.inputmethod.InputConnection
    public Handler getHandler() {
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public CharSequence getSelectedText(int i10) {
        if (i2.e0.f(this.f18080d.c())) {
            return null;
        }
        return f0.a(this.f18080d).toString();
    }

    @Override // android.view.inputmethod.InputConnection
    public CharSequence getTextAfterCursor(int i10, int i11) {
        return f0.b(this.f18080d, i10).toString();
    }

    @Override // android.view.inputmethod.InputConnection
    public CharSequence getTextBeforeCursor(int i10, int i11) {
        return f0.c(this.f18080d, i10).toString();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // android.view.inputmethod.InputConnection
    public boolean performContextMenuAction(int i10) {
        int i11;
        boolean z10 = this.f18084h;
        if (z10) {
            z10 = false;
            switch (i10) {
                case R.id.selectAll:
                    b(new d0(0, this.f18080d.d().length()));
                    break;
                case R.id.cut:
                    i11 = 277;
                    e(i11);
                    break;
                case R.id.copy:
                    i11 = 278;
                    e(i11);
                    break;
                case R.id.paste:
                    i11 = 279;
                    e(i11);
                    break;
            }
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean performEditorAction(int i10) {
        int iA;
        boolean z10 = this.f18084h;
        if (!z10) {
            return z10;
        }
        if (i10 != 0) {
            switch (i10) {
                case 2:
                    iA = j.f18147b.c();
                    break;
                case 3:
                    iA = j.f18147b.g();
                    break;
                case 4:
                    iA = j.f18147b.h();
                    break;
                case 5:
                    iA = j.f18147b.d();
                    break;
                case 6:
                    iA = j.f18147b.b();
                    break;
                case 7:
                    iA = j.f18147b.f();
                    break;
                default:
                    Log.w("RecordingIC", "IME sends unsupported Editor Action: " + i10);
                    iA = j.f18147b.a();
                    break;
            }
        } else {
            iA = j.f18147b.a();
        }
        this.f18077a.d(iA);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean performPrivateCommand(String str, Bundle bundle) {
        boolean z10 = this.f18084h;
        if (z10) {
            return true;
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean reportFullscreenMode(boolean z10) {
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean requestCursorUpdates(int i10) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14 = this.f18084h;
        if (!z14) {
            return z14;
        }
        boolean z15 = false;
        boolean z16 = (i10 & 1) != 0;
        boolean z17 = (i10 & 2) != 0;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 33) {
            boolean z18 = (i10 & 16) != 0;
            boolean z19 = (i10 & 8) != 0;
            boolean z20 = (i10 & 4) != 0;
            if (i11 >= 34 && (i10 & 32) != 0) {
                z15 = true;
            }
            if (z18 || z19 || z20 || z15) {
                z11 = z15;
                z10 = z20;
                z13 = z19;
                z12 = z18;
            } else if (i11 >= 34) {
                z12 = true;
                z13 = true;
                z10 = true;
                z11 = true;
            } else {
                z11 = z15;
                z12 = true;
                z13 = true;
                z10 = true;
            }
        } else {
            z10 = false;
            z11 = false;
            z12 = true;
            z13 = true;
        }
        this.f18077a.c(z16, z17, z12, z13, z10, z11);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean sendKeyEvent(KeyEvent keyEvent) {
        boolean z10 = this.f18084h;
        if (!z10) {
            return z10;
        }
        this.f18077a.a(keyEvent);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean setComposingRegion(int i10, int i11) {
        boolean z10 = this.f18084h;
        if (z10) {
            b(new b0(i10, i11));
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean setComposingText(CharSequence charSequence, int i10) {
        boolean z10 = this.f18084h;
        if (z10) {
            b(new c0(String.valueOf(charSequence), i10));
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean setSelection(int i10, int i11) {
        boolean z10 = this.f18084h;
        if (!z10) {
            return z10;
        }
        b(new d0(i10, i11));
        return true;
    }
}
