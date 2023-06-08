import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-scroller.js';

@customElement('vista-ver_mis_seguidores')
export class VistaVer_mis_seguidores extends LitElement {
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
 <vaadin-vertical-layout style="width: 100%; height: 5%;">
  <div id="divCabecera" style="width: 100%; height: 100%;"></div>
 </vaadin-vertical-layout>
 <vaadin-horizontal-layout style="width: 100%; height: 95%;">
  <vaadin-vertical-layout style="width: 70%; height: 100%;">
   <div style="width: 100%; height: 100%; position: relative;">
    <vaadin-scroller id="idScroller" style="width: 100%; height: 100%;"></vaadin-scroller>
   </div>
  </vaadin-vertical-layout>
  <div id="divConfigurar" style="width: 30%; height: 100%;"></div>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
