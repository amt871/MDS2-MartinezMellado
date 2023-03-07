import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';

class VistaLogin extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
<vaadin-vertical-layout style="width: 100%; height: 100%; align-items: stretch; justify-content: center;" id="vaadinVerticalLayout">
 <label id="label" style="margin: var(--lumo-space-xl); padding: var(--lumo-space-xl); align-self: center; flex-grow: 0; flex-shrink: 0;">SE ESTAN COCINANDO COSAS</label>
</vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'vista-login';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaLogin.is, VistaLogin);
