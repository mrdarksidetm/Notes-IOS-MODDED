package com.revenuecat.purchases.paywalls.components;

import ae.j;
import ae.r;
import af.j1;
import af.z0;
import com.revenuecat.purchases.paywalls.components.ButtonComponent;
import md.q;
import we.b;
import ye.f;
import ze.d;

/* JADX INFO: loaded from: classes2.dex */
final class ActionSurrogate {
    private final DestinationSurrogate destination;
    private final ActionTypeSurrogate type;
    private final UrlSurrogate url;
    public static final Companion Companion = new Companion(null);
    private static final b<Object>[] $childSerializers = {ActionTypeSurrogate.Companion.serializer(), DestinationSurrogate.Companion.serializer(), null};

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(j jVar) {
            this();
        }

        public final b<ActionSurrogate> serializer() {
            return ActionSurrogate$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[DestinationSurrogate.values().length];
            try {
                iArr[DestinationSurrogate.customer_center.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DestinationSurrogate.privacy_policy.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DestinationSurrogate.terms.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[DestinationSurrogate.url.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[ActionTypeSurrogate.values().length];
            try {
                iArr2[ActionTypeSurrogate.restore_purchases.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[ActionTypeSurrogate.navigate_back.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[ActionTypeSurrogate.navigate_to.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public /* synthetic */ ActionSurrogate(int i10, ActionTypeSurrogate actionTypeSurrogate, DestinationSurrogate destinationSurrogate, UrlSurrogate urlSurrogate, j1 j1Var) {
        if (1 != (i10 & 1)) {
            z0.a(i10, 1, ActionSurrogate$$serializer.INSTANCE.getDescriptor());
        }
        this.type = actionTypeSurrogate;
        if ((i10 & 2) == 0) {
            this.destination = null;
        } else {
            this.destination = destinationSurrogate;
        }
        if ((i10 & 4) == 0) {
            this.url = null;
        } else {
            this.url = urlSurrogate;
        }
    }

    public ActionSurrogate(ActionTypeSurrogate actionTypeSurrogate, DestinationSurrogate destinationSurrogate, UrlSurrogate urlSurrogate) {
        r.f(actionTypeSurrogate, "type");
        this.type = actionTypeSurrogate;
        this.destination = destinationSurrogate;
        this.url = urlSurrogate;
    }

    public /* synthetic */ ActionSurrogate(ActionTypeSurrogate actionTypeSurrogate, DestinationSurrogate destinationSurrogate, UrlSurrogate urlSurrogate, int i10, j jVar) {
        this(actionTypeSurrogate, (i10 & 2) != 0 ? null : destinationSurrogate, (i10 & 4) != 0 ? null : urlSurrogate);
    }

    public ActionSurrogate(ButtonComponent.Action action) {
        ActionTypeSurrogate actionTypeSurrogate;
        DestinationSurrogate destinationSurrogate;
        r.f(action, "action");
        boolean z10 = action instanceof ButtonComponent.Action.NavigateBack;
        if (z10) {
            actionTypeSurrogate = ActionTypeSurrogate.navigate_back;
        } else if (action instanceof ButtonComponent.Action.NavigateTo) {
            actionTypeSurrogate = ActionTypeSurrogate.navigate_to;
        } else {
            if (!(action instanceof ButtonComponent.Action.RestorePurchases)) {
                throw new q();
            }
            actionTypeSurrogate = ActionTypeSurrogate.restore_purchases;
        }
        UrlSurrogate urlSurrogate = null;
        if (z10 ? true : action instanceof ButtonComponent.Action.RestorePurchases) {
            destinationSurrogate = null;
        } else {
            if (!(action instanceof ButtonComponent.Action.NavigateTo)) {
                throw new q();
            }
            ButtonComponent.Destination destination = ((ButtonComponent.Action.NavigateTo) action).getDestination();
            if (destination instanceof ButtonComponent.Destination.CustomerCenter) {
                destinationSurrogate = DestinationSurrogate.customer_center;
            } else if (destination instanceof ButtonComponent.Destination.PrivacyPolicy) {
                destinationSurrogate = DestinationSurrogate.privacy_policy;
            } else if (destination instanceof ButtonComponent.Destination.Terms) {
                destinationSurrogate = DestinationSurrogate.terms;
            } else {
                if (!(destination instanceof ButtonComponent.Destination.Url)) {
                    throw new q();
                }
                destinationSurrogate = DestinationSurrogate.url;
            }
        }
        if (!(z10 ? true : action instanceof ButtonComponent.Action.RestorePurchases)) {
            if (!(action instanceof ButtonComponent.Action.NavigateTo)) {
                throw new q();
            }
            ButtonComponent.Action.NavigateTo navigateTo = (ButtonComponent.Action.NavigateTo) action;
            ButtonComponent.Destination destination2 = navigateTo.getDestination();
            if (!(destination2 instanceof ButtonComponent.Destination.CustomerCenter)) {
                if (destination2 instanceof ButtonComponent.Destination.PrivacyPolicy) {
                    urlSurrogate = new UrlSurrogate(((ButtonComponent.Destination.PrivacyPolicy) navigateTo.getDestination()).getUrlLid(), ((ButtonComponent.Destination.PrivacyPolicy) navigateTo.getDestination()).getMethod());
                } else if (destination2 instanceof ButtonComponent.Destination.Terms) {
                    urlSurrogate = new UrlSurrogate(((ButtonComponent.Destination.Terms) navigateTo.getDestination()).getUrlLid(), ((ButtonComponent.Destination.Terms) navigateTo.getDestination()).getMethod());
                } else {
                    if (!(destination2 instanceof ButtonComponent.Destination.Url)) {
                        throw new q();
                    }
                    urlSurrogate = new UrlSurrogate(((ButtonComponent.Destination.Url) navigateTo.getDestination()).getUrlLid(), ((ButtonComponent.Destination.Url) navigateTo.getDestination()).getMethod());
                }
            }
        }
        this(actionTypeSurrogate, destinationSurrogate, urlSurrogate);
    }

    public static final /* synthetic */ void write$Self(ActionSurrogate actionSurrogate, d dVar, f fVar) {
        b<Object>[] bVarArr = $childSerializers;
        dVar.E(fVar, 0, bVarArr[0], actionSurrogate.type);
        if (dVar.r(fVar, 1) || actionSurrogate.destination != null) {
            dVar.k(fVar, 1, bVarArr[1], actionSurrogate.destination);
        }
        if (dVar.r(fVar, 2) || actionSurrogate.url != null) {
            dVar.k(fVar, 2, UrlSurrogate$$serializer.INSTANCE, actionSurrogate.url);
        }
    }

    public final DestinationSurrogate getDestination() {
        return this.destination;
    }

    public final ActionTypeSurrogate getType() {
        return this.type;
    }

    public final UrlSurrogate getUrl() {
        return this.url;
    }

    public final ButtonComponent.Action toAction() {
        ButtonComponent.Destination privacyPolicy;
        int i10 = WhenMappings.$EnumSwitchMapping$1[this.type.ordinal()];
        if (i10 == 1) {
            return ButtonComponent.Action.RestorePurchases.INSTANCE;
        }
        if (i10 == 2) {
            return ButtonComponent.Action.NavigateBack.INSTANCE;
        }
        if (i10 != 3) {
            throw new q();
        }
        DestinationSurrogate destinationSurrogate = this.destination;
        int i11 = destinationSurrogate == null ? -1 : WhenMappings.$EnumSwitchMapping$0[destinationSurrogate.ordinal()];
        if (i11 == -1) {
            throw new IllegalStateException("`destination` cannot be null when `action` is `navigate_to`.".toString());
        }
        if (i11 == 1) {
            privacyPolicy = ButtonComponent.Destination.CustomerCenter.INSTANCE;
        } else if (i11 != 2) {
            if (i11 != 3) {
                if (i11 != 4) {
                    throw new q();
                }
                if (this.url == null) {
                    throw new IllegalStateException("`url` cannot be null when `destination` is `url`.".toString());
                }
                privacyPolicy = new ButtonComponent.Destination.Url(this.url.getUrl_lid(), this.url.getMethod());
            } else {
                if (this.url == null) {
                    throw new IllegalStateException("`url` cannot be null when `destination` is `terms`.".toString());
                }
                privacyPolicy = new ButtonComponent.Destination.Terms(this.url.getUrl_lid(), this.url.getMethod());
            }
        } else {
            if (this.url == null) {
                throw new IllegalStateException("`url` cannot be null when `destination` is `privacy_policy`.".toString());
            }
            privacyPolicy = new ButtonComponent.Destination.PrivacyPolicy(this.url.getUrl_lid(), this.url.getMethod());
        }
        return new ButtonComponent.Action.NavigateTo(privacyPolicy);
    }
}
