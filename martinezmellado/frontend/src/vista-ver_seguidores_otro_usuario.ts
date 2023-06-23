import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-scroller.js';

@customElement('vista-ver_seguidores_otro_usuario')
export class VistaVer_seguidores_otro_usuario extends LitElement {
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
 <vaadin-horizontal-layout theme="" style="width: 100%; height: 95%;">
  <div style="height: 100%; width: 60%;">
   <vaadin-scroller id="scroller" style="width: 100%; height: 100%;"></vaadin-scroller>
  </div>
  <vaadin-vertical-layout style="height: 100%; width: 40%; align-items: center; justify-content: center;">
   <img id="image" style="max-width: 50%; max-height: 50%;">
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
