import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-scroller.js';

@customElement('vista-ver_me_gustas__otro_usuario_')
export class VistaVer_me_gustas__otro_usuario_ extends LitElement {
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
 <vaadin-horizontal-layout style="width: 100%; height: 95%;">
  <vaadin-vertical-layout style="height: 100%; width: 60%; align-items: center; justify-content: center;">
   <vaadin-vertical-layout id="layoutVideo" style="width: 100%; height: 100%; align-items: center; justify-content: center;"></vaadin-vertical-layout>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout style="width: 40%; height: 100%; align-items: center; justify-content: center;">
   <img id="image" style="max-width: 20%; max-height: 20%;">
   <div style="width: 90%; height: 60%;">
    <vaadin-scroller id="scroller" style="width: 100%; height: 100%;"></vaadin-scroller>
   </div>
   <vaadin-button style="align-self: flex-start; margin-left: var(--lumo-space-xl); margin-top: var(--lumo-space-xl);" id="bAnterior">
     Anterior 
   </vaadin-button>
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
