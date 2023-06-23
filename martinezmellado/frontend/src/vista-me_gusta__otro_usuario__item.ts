import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';

@customElement('vista-me_gusta__otro_usuario__item')
export class VistaMe_gusta__otro_usuario__item extends LitElement {
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
<vaadin-vertical-layout style="width: 100%; height: 100%; align-items: center; justify-content: center; position: relative;">
 <vaadin-horizontal-layout style="width: 100%; height: 100%; align-items: center;">
  <vaadin-horizontal-layout style="width: 20%; height: 100%;">
   <img style="max-width: 100%; max-height: 100%;" id="img">
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout style="width: 80%; height: 100%; justify-content: center; align-items: center;">
   <vaadin-horizontal-layout style="width: 100%; height: 100%; align-items: center; justify-content: center;">
    <label id="labelUsuario">Usuario</label>
   </vaadin-horizontal-layout>
  </vaadin-horizontal-layout>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
