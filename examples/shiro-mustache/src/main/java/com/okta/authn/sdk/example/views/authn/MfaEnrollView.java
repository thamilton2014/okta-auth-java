/*
 * Copyright 2018 Okta, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.okta.authn.sdk.example.views.authn;

import com.okta.authn.sdk.example.views.BaseView;
import com.okta.authn.sdk.resource.Factor;

public class MfaEnrollView extends BaseView {

    private final Factor factor;

    public MfaEnrollView(Factor factor) {
        super("enroll-" + MfaVerifyView.relativeLink(factor) + ".mustache");
        this.factor = factor;
    }

    public Factor getFactor() {
        return factor;
    }
}