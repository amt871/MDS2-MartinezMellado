import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-scroller.js';

@customElement('vista-publicaciones_asociadas_a_un_hastag')
export class VistaPublicaciones_asociadas_a_un_hastag extends LitElement {
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
<vaadin-vertical-layout style="width: 100%; height: 100%; position: absolute;" theme="spacing">
 <div id="divCabecera" style="width: 100%; height: 5%;"></div>
 <vaadin-vertical-layout style="width: 100%; height: 95%;">
  <vaadin-horizontal-layout style="width: 100%; height: 5%; align-items: center; justify-content: center;">
   <label style="align-self: center;" id="labelHashtag">Hashtag </label>
  </vaadin-horizontal-layout>
  <div style="width: 100%; height: 95%;">
   <vaadin-scroller id="scroller" style="width: 100%; height: 100%;"></vaadin-scroller>
  </div>
 </vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
