import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

@customElement('vista-comentario_item')
export class VistaComentario_item extends LitElement {
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
<vaadin-vertical-layout style="width: 100%; height: 100%; align-items: center; justify-content: center;">
 <vaadin-horizontal-layout style="width: 100%; height: 100%; align-items: center;">
  <img style="width: 20%; height: 100%;" src="../../resources/icons/user.svg">
  <vaadin-horizontal-layout style="width: 60%; height: 100%; align-items: center;">
   <label>Comentario</label>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout style="height: 100%; width: 20%; justify-content: center; align-items: center;">
   <vaadin-button>
    Denunciar
   </vaadin-button>
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
