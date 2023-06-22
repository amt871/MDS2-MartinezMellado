import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-scroller.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

@customElement('vista-ver_me_gustas__no_registrado_')
export class VistaVer_me_gustas__no_registrado_ extends LitElement {
  static get styles() {
    return css`
      :host {
          display: block;
          height: 100%;
      }
      `;
  }

  render() {
    return html`
<vaadin-vertical-layout style="width: 100%; height: 100%; position: absolute;">
 <div id="divCabecera" style="width: 100%; height: 5%;"></div>
 <vaadin-horizontal-layout style="height: 95%; width: 100%;">
  <vaadin-vertical-layout style="height: 100%; width: 60%; justify-content: center; align-items: center;">
   <vaadin-vertical-layout id="layoutVideo" style="align-items: center; justify-content: center; width: 100%; height: 100%;"></vaadin-vertical-layout>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout style="height: 100%; width: 40%; justify-content: center; align-items: center;">
   <img style="max-width: 20%; max-height: 20%;" id="image">
   <div style="width: 90%; height: 60%;">
    <vaadin-scroller style="width: 100%; height: 100%;" id="scroller"></vaadin-scroller>
   </div>
   <vaadin-horizontal-layout style="width: 90%; justify-content: flex-start; align-items: center;">
    <vaadin-button style="margin-top: var(--lumo-space-l);" id="bAnterior">
      Atras 
    </vaadin-button>
   </vaadin-horizontal-layout>
  </vaadin-vertical-layout>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
