import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-scroller.js';

@customElement('vista-ver_perfil__no_registrado_')
export class VistaVer_perfil__no_registrado_ extends LitElement {
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
<vaadin-vertical-layout theme="spacing" style="width: 100%; height: 100%; position: absolute;">
 <div id="divCabecera" style="width: 100%; height: 5%;"></div>
 <vaadin-horizontal-layout style="width: 100%; height: 20%;">
  <vaadin-horizontal-layout style="width: 100%; height: 100%; align-items: center; justify-content: flex-end;">
   <label id="labelSeguidores">Label</label>
  </vaadin-horizontal-layout>
  <vaadin-vertical-layout style="width: 100%; height: 100%; align-items: center; justify-content: center;">
   <img id="image" style="max-width: 100%; max-height: 100%;">
  </vaadin-vertical-layout>
  <vaadin-horizontal-layout style="width: 100%; height: 100%; align-items: center; justify-content: flex-start;">
   <label id="labelMeGustas">Label</label>
  </vaadin-horizontal-layout>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout style="width: 100%; height: 5%; align-items: center; justify-content: center;">
  <label id="labelUsuario">Label</label>
 </vaadin-horizontal-layout>
 <div style="width: 100%; height: 70%;">
  <vaadin-scroller id="scroller" style="width: 100%; height: 100%;"></vaadin-scroller>
 </div>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
